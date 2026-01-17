SUMMARY = "Budgie Desktop View is the official Budgie desktop icons application / implementation"
HOMEPAGE = "https://github.com/BuddiesOfBudgie/budgie-desktop-view"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=2ee41112a44fe7014dce33e26468ba93"


DEPENDS = " \
    glib-2.0 \
    gtk+3 \
    gtk-layer-shell \
    libxfce4windowing \
    intltool-native \
"

inherit meson pkgconfig gettext gobject-introspection vala features_check

REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"

SRC_URI = "git://github.com/BuddiesOfBudgie/budgie-desktop-view.git;protocol=https;nobranch=1"
SRCREV = "a16e9d00be143265bbd2e892528312d2bdd7dfd2"

GIR_MESON_OPTION = ""

FILES:${PN} += "${datadir}"

