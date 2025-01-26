DESCRIPTION = "AAlib is a portable library for rendering graphics as ASCII art."
HOMEPAGE = "http://aa-project.sourceforge.net/aalib/"
SECTION = "libs"

DEPENDS = "ncurses"

LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=55ca817ccb7d5b5b66355690e9abc605"

S = "${WORKDIR}/aalib-1.4.0"

SRC_URI = " \
	${SOURCEFORGE_MIRROR}/projects/aa-project/files/aa-lib/1.4rc5/aalib-1.4rc5.tar.gz \
	file://aalib-aalinuxkbd-return.patch \
	file://aalib-free-offset-pointer.patch \
	file://aalib-key-down-OOB.patch \
	file://aalib-opaque-ncurses-fix.patch \
	file://aclocal-fixes.patch \
	file://aalib-c99.patch \
	file://aalib-fix-aarender.patch \
	file://aalib-m4.patch \
	file://aalib-mouse.patch \
"
SRC_URI[sha256sum] = "fbddda9230cf6ee2a4f5706b4b11e2190ae45f5eda1f0409dc4f99b35e0a70ee"

inherit autotools

EXTRA_OECONF += "--with-ncurses=${STAGING_DIR_HOST}"

do_install:append() {
	rm -f ${D}${bindir}/aalib-config
}
