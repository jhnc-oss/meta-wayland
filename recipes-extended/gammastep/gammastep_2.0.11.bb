SUMMARY = "Adjust the color temperature of your screen according to your surroundings"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://gitlab.com/chinstrap/gammastep.git;protocol=https;branch=master"
SRCREV = "60f3fe757a9a218379b10e991486f91c10c5a215"

DEPENDS = "libx11 libxcb wayland wayland-native glib-2.0 libdrm geoclue libxxf86vm intltool-native"

inherit autotools pkgconfig gettext

EXTRA_OEMAKE = "WAYLAND_SCANNER=${STAGING_BINDIR_NATIVE}/wayland-scanner"

FILES:${PN} += "${libdir} ${datadir}"
