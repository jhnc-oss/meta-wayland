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
    glib-2.0 \
    gmobile \
    gnome-desktop \
    gtk+3 \
    gcr3 \
    libgudev \
    libhandy \
    libsecret \
    networkmanager \
    polkit \
    pulseaudio \
    libsoup-3.0 \
    upower \
    wayland \
    wayland-native \
    wayland-protocols \
"

RDEPENDS:${PN} = " \
    polkit-gnome \
    gsettings-desktop-schemas \
    phoc \
    squeekboard \
    gnome-desktop \
    gnome-session \
    wl-clipboard \
    calls \
"

PACKAGECONFIG[tests] = "-Dtests=true,-Dtests=false"
PACKAGECONFIG[phoc_tests] = "-Dphoc_tests=enabled,-Dphoc_tests=disabled"
PACKAGECONFIG[tools] = "-Dtools=true,-Dtools=false"

PACKAGECONFIG ?= ""

inherit features_check gsettings meson pkgconfig gtk-icon-cache gobject-introspection gi-docgen

SRC_URI = " \
    gitsm://gitlab.gnome.org/World/Phosh/phosh.git;protocol=https;nobranch=1 \
    file://0001-meson.build-dont-read-includedir-from-pkg-config.patch \
"

S = "${WORKDIR}/git"
PV = "0.40.0"
SRCREV = "afef417667369f4943c8acfa24b4477e4197359e"

EXTRA_OEMESON += "--buildtype=release"

FILES:${PN} += "${datadir} ${libdir}"

