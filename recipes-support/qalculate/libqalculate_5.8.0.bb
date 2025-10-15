SUMMARY = "Qalculate! is a multi-purpose cross-platform desktop calculator"
HOMEPAGE = "https://github.com/Qalculate"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://COPYING;md5=570a9b3749dd0463a1778803b12a6dce"

SRC_URI = "git://github.com/Qalculate/libqalculate;protocol=https;branch=master"

SRCREV = "c081977d84cb7c3712e37b1d93fed05c7f4bb39d"

inherit autotools pkgconfig gettext

DEPENDS += "libxml2 curl icu virtual/libiconv readline mpfr gmp intltool-native p11-kit"

FILES:${PN} += "${datadir}/qalculate"

do_install:append() {
	sed -i 's|${STAGING_DIR_HOST}||g' ${D}${libdir}/pkgconfig/libqalculate.pc
}
