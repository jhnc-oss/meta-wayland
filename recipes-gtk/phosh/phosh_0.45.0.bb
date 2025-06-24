SUMMARY = "a pure wayland shell for mobile devices like Purism's Librem 5."
HOMEPAGE = "https://source.puri.sm/Librem5/feedbackd"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "wayland polkit pam pulseaudio"

DEPENDS = " \
    libcall-ui \
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
    libgnome-volume-control \
    libsecret \
    networkmanager \
    polkit \
    pulseaudio \
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

SRC_URI = " \
    git://gitlab.gnome.org/World/Phosh/phosh.git;protocol=https;nobranch=1 \
    file://0001-meson-build-without-subproject-wrap.patch \
"

SRCREV = "2ac03f70f8d42b729def38e282f5b600286655fb"

EXTRA_OEMESON += "--buildtype=release"

FILES:${PN} += "${datadir} ${libdir}"

