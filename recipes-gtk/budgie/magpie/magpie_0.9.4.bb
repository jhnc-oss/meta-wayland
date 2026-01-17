SUMMARY = "Window and compositing manager based on Clutter"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = " \
    atk \
    libxi \
    virtual/libx11 \
    xrandr \
    colord \
    graphene \
    gtk+3 \
    gdk-pixbuf \
    cairo \
    pango \
    gsettings-desktop-schemas \
    libice \
    libdisplay-info \
    libinput \
    libxcvt-native \
    libxtst \
    libxkbfile \
    python3-argcomplete-native \
    python3-docutils-native \
    libcanberra \
    libwacom \
    libgudev \
    startup-notification \
    pipewire \
    lcms \
    fribidi \
    xinerama \
"


inherit meson pkgconfig gsettings gobject-introspection gettext features_check


SRC_URI = "git://github.com/BuddiesOfBudgie/magpie.git;protocol=https;nobranch=1"
SRCREV = "08258450d05ff23ed9d572a13e9a12727a8230e8"

#SRC_URI += "file://0001-Dont-use-system-sysprof-dbus-folder.patch"

# x11 is still manadatory - see meson.build
REQUIRED_DISTRO_FEATURES = "wayland x11"

# profiler requires sysprof 3.34 which is not willing to build atow
PACKAGECONFIG ??= " \
    native-backend \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl x11', 'opengl glx', '', d)} \
    sm \
"

# combi-config - see meson_options.txt for more details
PACKAGECONFIG[native-backend] = "-Dnative_backend=true -Dudev=true, -Dnative_backend=false -Dudev=false, libdrm virtual/libgbm libinput virtual/egl virtual/libgles2 udev"
PACKAGECONFIG[opengl] = "-Dopengl=true, -Dopengl=false, virtual/libgl"
PACKAGECONFIG[glx] = "-Dglx=true, -Dglx=false"
PACKAGECONFIG[libwacom] = "-Dlibwacom=true, -Dlibwacom=false, libwacom"
# Remove depending on pipewire-0.2 when mutter is upgraded to 3.36+
PACKAGECONFIG[sm] = "-Dsm=true, -Dsm=false, libsm"
PACKAGECONFIG[profiler] = "-Dprofiler=true,-Dprofiler=false,sysprof"

MAGPIE_API_NAME = "magpie-0"

do_install:prepend() {
    sed -i -e 's|${B}/||g' ${B}/clutter/clutter/clutter-enum-types.c
    sed -i -e 's|${B}/||g' ${B}/src/meta-private-enum-types.c
    sed -i -e 's|${B}/||g' ${B}/src/meta/meta-enum-types.c
}


do_install:append() {
    # Add gir links in standard paths. That makes dependents life much easier
    # to find them
    install -d ${D}${datadir}/gir-1.0
    for gir_full in `find ${D}${libdir}/${MAGPIE_API_NAME} -name '*.gir'`; do
        gir=`basename "$gir_full"`
        ln -sr "${D}${libdir}/${MAGPIE_API_NAME}/$gir" "${D}${datadir}/gir-1.0/$gir"
    done
}

GSETTINGS_PACKAGE = "${PN}-gsettings"

PACKAGES =+ "${PN}-tests ${PN}-gsettings"

FILES:${PN} += " \
    ${datadir}/bash-completion \
    ${datadir}/gnome-control-center \
    ${datadir}/gir-1.0 \
    ${libdir}/${MAGPIE_API_NAME}/lib*${SOLIBS} \
    ${libdir}/${MAGPIE_API_NAME}/*.typelib \
    ${libdir}/${MAGPIE_API_NAME}/plugins \
"

FILES:${PN}-tests += " \
    ${datadir}/installed-tests \
    ${datadir}/${MAGPIE_API_NAME}/tests \
    ${libexecdir}/installed-tests/${MAGPIE_API_NAME} \
"

FILES:${PN}-dev += " \
    ${libdir}/${MAGPIE_API_NAME}/*.gir \
    ${libdir}/${MAGPIE_API_NAME}/lib*.so \
"

RDEPENDS:${PN} += "${PN}-gsettings gsettings-desktop-schemas"

