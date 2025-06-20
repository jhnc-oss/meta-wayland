SUMMARY = "Granite is a companion library for GTK and GLib."
HOMEPAGE = "https://github.com/elementary/granite"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"


DEPENDS = " \
	gtk4 \
	glib-2.0 \
	libgee \
	sassc-native \
"

REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"

SRC_URI = "git://github.com/elementary/granite.git;protocol=https;nobranch=1"

PV = "7.4.0"
SRCREV = "949703f8649013695c6d32eb84a6b541ac0da4db"

inherit meson pkgconfig gobject-introspection vala features_check

FILES:${PN} += "${datadir}"
