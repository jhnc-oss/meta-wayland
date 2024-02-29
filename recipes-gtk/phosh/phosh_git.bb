SUMMARY = "a pure wayland shell for mobile devices like Purism's Librem 5."
HOMEPAGE = "https://source.puri.sm/Librem5/feedbackd"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "wayland polkit pam pulseaudio"

DEPENDS = " \
    callaudiod \
    evolution-data-server \
    evince \
    feedbackd \
    fribidi \
    gcr \
    glib-2.0 \
    gnome-desktop \
    gtk+3 \
    gtk4 \
    libadwaita \
    libgudev \
    libhandy \
    libsecret \
    networkmanager \
    polkit \
    pulseaudio \
    upower \
    wayland \
    wayland-native \
    wayland-protocols \
"

RDEPENDS:${PN} = " \
    polkit-gnome \
    gsettings-desktop-schemas \
    phoc \
    gnome-desktop \
    wl-clipboard \
    calls \
"

PACKAGECONFIG[tests] = "-Dtests=true,-Dtests=false"
PACKAGECONFIG[tools] = "-Dtools=true,-Dtools=false"
# install systemd service files ?
PACKAGECONFIG[systemd] = "-Dsystemd=true,-Dsystemd=false"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	tools \
"

inherit features_check gsettings meson pkgconfig gtk-icon-cache

SRC_URI = " \
    gitsm://gitlab.gnome.org/World/Phosh/phosh.git;protocol=https;nobranch=1 \
"

S = "${WORKDIR}/git"
PV = "0.36.0"
SRCREV = "62a4ba9d8a38750a49ae6187f3497c54a030be45"

EXTRA_OEMESON += "--buildtype=release"

do_install:append() {
    install -Dm 644 ${WORKDIR}/phosh.pam ${D}${sysconfdir}/pam.d/phosh
}

FILES:${PN} += "${datadir} ${libdir}"

