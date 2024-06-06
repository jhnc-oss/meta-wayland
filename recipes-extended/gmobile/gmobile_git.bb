SUMMARY = "gmobile carries some helpers for GNOME on mobile devices"
LICENSE = "GPL-3.0-only & LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit meson pkgconfig gobject-introspection

DEPENDS = "glib-2.0 json-glib"

SRC_URI = "git://gitlab.gnome.org/World/Phosh/gmobile.git;protocol=https;branch=main"
S = "${WORKDIR}/git"
SRCREV = "3f3a8c70f6106e00388075c77982876857b321d8"
PV = "0.2.0"

do_install:append() {
	install -m 0644 ${B}/gm-config.h ${D}${includedir}
}
