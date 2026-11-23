SUMMARY = "gmobile carries some helpers for GNOME on mobile devices"
LICENSE = "GPL-3.0-only AND LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit meson pkgconfig gobject-introspection vala

DEPENDS = "glib-2.0 json-glib"

SRC_URI = "git://gitlab.gnome.org/World/Phosh/gmobile.git;protocol=https;branch=main;tag=v${PV}"
SRCREV = "ee063f756afe51498801863412762a525fa552e0"

do_install:append() {
	install -m 0644 ${B}/gm-config.h ${D}${includedir}
}
