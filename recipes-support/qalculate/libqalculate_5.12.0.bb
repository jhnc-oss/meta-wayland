SUMMARY = "Qalculate! is a multi-purpose cross-platform desktop calculator"
HOMEPAGE = "https://github.com/Qalculate"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://COPYING;md5=570a9b3749dd0463a1778803b12a6dce"

SRC_URI = "git://github.com/Qalculate/libqalculate;protocol=https;branch=master"

SRCREV = "d01cfdae6f965bf9264af3b52db8f5b0345fe1da"

inherit autotools pkgconfig gettext

EXTRA_OEMAKE += "USE_NLS=no"

DEPENDS += "libxml2 curl icu readline mpfr gmp p11-kit"

FILES:${PN} += "${datadir}/qalculate"

do_install:append() {
	sed -i 's|${STAGING_DIR_HOST}||g' ${D}${libdir}/pkgconfig/libqalculate.pc
}
