SUMMARY = "KWin is an easy to use, but flexible, compositor for Wayland on Linux"
HOMEPAGE = "https://invent.kde.org/plasma/kwin"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/kwin.git;protocol=https;nobranch=1"
SRCREV = "8b25936b278d8944c8b3e4b04a849f7bb6f3c404"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d-native \
    qtdeclarative \
    qtsensors \
    qtsvg \
    qt5compat \
    extra-cmake-modules \
    kdeclarative \
    kauth \
    kcrash \
    kcmutils \
    kcmutils-tools-native \
    ki18n \
    kservice \
    kwidgetaddons \
    kwindowsystem \
    kdbusaddons \
    kconfig-native \
    kguiaddons \
    kidletime \
    ksvg \
    kpackage \
    kglobalaccel \
    plasma-activities \
    knewstuff \
    kxmlgui \
    knighttime \
    kwayland \
    kpipewire \
    plasma-activities \
    kirigami \
    libplasma \
    kdecoration \
    breeze-icons \
    aurorae \
    libxcvt \
    libepoxy \
    virtual/egl \
    wayland \
    wayland-native \
    wayland-protocols \
    plasma-wayland-protocols \
    libxkbcommon \
    libcanberra \
    libinput \
    libei \
    libdrm \
    virtual/libgbm \
    lcms \
    freetype \
    fontconfig \
    hwdata \
    libdisplay-info \
    pipewire \
    knotifications \
    kglobalacceld \
    systemd \
    qtwaylandscanner-kde-native \
"

inherit qt6-cmake gettext pkgconfig

EXTRA_OECMAKE += " \
	-DBUILD_TESTING=OFF \
	-DKWIN_BUILD_X11=OFF \
	-DKWIN_BUILD_SCREENLOCKER=OFF \
	-DQTWAYLANDSCANNER_KDE_EXECUTABLE=${STAGING_BINDIR_NATIVE}/qtwaylandscanner_kde \
"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
	# kwin indeed wants to use kconfig_compiler_kf6 and kcmdesktopfilegenerator-> create links instead of touch
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${datadir} ${libdir}/qml ${libdir}/plugins ${libdir}/kconf_update_bin ${systemd_user_unitdir}"


RDEPENDS:${PN} += "kconfig kirigami qtquick3d breeze-icons"
