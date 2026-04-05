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
    gnome-bluetooth \
    gnome-desktop \
    gtk+3 \
    gcr3 \
    libgudev \
    libhandy \
    libsecret \
    networkmanager \
    polkit \
    pulseaudio \
    qrcodegen \
    libsoup \
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

SRC_URI = "git://gitlab.gnome.org/World/Phosh/phosh.git;protocol=https;nobranch=1;name=phosh"
SRC_URI += "git://gitlab.gnome.org/GNOME/libgnome-volume-control.git;protocol=https;subdir=${S}/subprojects/gvc;name=gvc;nobranch=1"
SRC_URI += "git://gitlab.gnome.org/World/Phosh/libcall-ui;protocol=https;subdir=${S}/subprojects/libcall-ui;name=libcall-ui;nobranch=1"
SRCREV_phosh = "484333d2b0536bb0eb1aae61884bcdd978bad49f"
SRCREV_gvc = "d2442f455844e5292cb4a74ffc66ecc8d7595a9f"
SRCREV_libcall-ui = "7389b4ae90e101620ef8e790e76a98e434bd920c"
SRCREV_FORMAT = "phosh"


EXTRA_OEMESON += "--buildtype=release"

FILES:${PN} += "${datadir} ${libdir}"

