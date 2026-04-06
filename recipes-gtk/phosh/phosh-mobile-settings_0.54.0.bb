SUMMARY = "Mobile Settings App for phosh and related components"
HOMEPAGE = "https://gitlab.gnome.org/World/Phosh/phosh-mobile-settings"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS = " \
    glib-2.0 \
    gmobile \
    gtk4 \
    libadwaita \
    gnome-desktop \
    json-glib \
    libportal \
    phosh \
    wayland \
    wayland-native \
    wayland-protocols \
    desktop-file-utils-native \
"

PACKAGECONFIG ?= ""
PACKAGECONFIG[manpages] = "-Dman=true,-Dman=false,rst2man-native"

inherit gsettings meson pkgconfig gtk-icon-cache gobject-introspection

SRC_URI = "git://gitlab.gnome.org/World/Phosh/phosh-mobile-settings.git;protocol=https;nobranch=1;name=phosh-mobile-settings"
SRC_URI += "git://gitlab.gnome.org/GNOME/libgnome-volume-control.git;protocol=https;subdir=${S}/subprojects/gvc;name=gvc;nobranch=1"
SRC_URI += "git://gitlab.freedesktop.org/devrtz/cellbroadcastd.git;protocol=https;subdir=${S}/subprojects/libcellbroadcast;name=libcellbroadcast;nobranch=1"
SRC_URI += "git://gitlab.gnome.org/GNOME/gvdb.git;protocol=https;subdir=${S}/subprojects/libcellbroadcast/subprojects/gvdb;name=gvdb;nobranch=1"
SRCREV_phosh-mobile-settings = "3426b7ea439921983b80accc8286a3ee74e918b7"
SRCREV_gvc = "d2442f455844e5292cb4a74ffc66ecc8d7595a9f"
SRCREV_libcellbroadcast = "c13213ee71a189f4bc74d5754c645bc12bf52c01"
SRCREV_gvdb = "4758f6fb7f889e074e13df3f914328f3eecb1fd3"
SRCREV_FORMAT = "phosh-mobile-settings"

EXTRA_OEMESON += "--buildtype=release"

FILES:${PN} += "${datadir}"

