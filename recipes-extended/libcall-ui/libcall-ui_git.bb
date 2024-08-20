SUMMARY = "Libcall-ui carries common user interface parts for call handling. It is meant to be used as a git submodule."
HOMEPAGE = "https://gitlab.gnome.org/World/Phosh/libcall-ui"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = "glib-2.0 libhandy gtk+3 callaudiod"

inherit meson pkgconfig gi-docgen gobject-introspection

SRC_URI = " \
	git://gitlab.gnome.org/World/Phosh/libcall-ui.git;protocol=https;branch=libcall-ui-0.1.x \
	file://0001-build-as-package.patch \
"

S = "${WORKDIR}/git"
PV = "0.1.3"
SRCREV = "60870e871e480e111e6a2fa50de67d1dd358d65a"

GIR_MESON_OPTION = ''

do_install:append() {
install -d ${D}${includedir}
	install -m 0644 ${B}/src/libcall-ui.a ${D}${libdir}
	cp -rf ${B}/src/libcall-ui.a.p ${D}${libdir}
	install -m 0644 ${B}/cui-config.h ${D}${includedir}
	install -m 0644 ${S}/src/*.h ${D}${includedir}
	install -m 0644 ${B}/src/*.h ${D}${includedir}
}

FILES:${PN} += "${libdir}/libcall-ui.a.p"