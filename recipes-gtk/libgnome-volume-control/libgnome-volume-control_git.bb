SUMMARY = "libgnome-volume-control is a copy library"
HOMEPAGE = "http://www.gimp.org"
SECTION = "graphics"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS = " \
	    glib-2.0 \
	    pulseaudio \
"

inherit meson pkgconfig

SRC_URI = " \
	git://gitlab.gnome.org/GNOME/libgnome-volume-control.git;protocol=https;branch=master \
	file://0001-build-as-package.patch \
"

S = "${WORKDIR}/git"
SRCREV = "5f9768a2eac29c1ed56f1fbb449a77a3523683b6"

do_install:append() {
	install -d ${D}${includedir}
	install -m 0644 ${B}/libgvc.a ${D}${libdir}
	cp -rf ${B}/libgvc.a.p ${D}${libdir}
	install -m 0644 ${S}/*.h ${D}${includedir}
	install -m 0644 ${B}/*.h ${D}${includedir}
}

FILES:${PN} += "${libdir}/libgvc.a.p"
