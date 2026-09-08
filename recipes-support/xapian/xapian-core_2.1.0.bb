SUMMARY = "Search engine library"
HOMEPAGE = "https://xapian.org/"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=570a9b3749dd0463a1778803b12a6dce"

SRC_URI = "https://oligarchy.co.uk/xapian/${PV}/${BP}.tar.xz"
SRC_URI[sha256sum] = "8e1259586d342e3d12b5e1f772e9185a10f2ba16e541566b5c3c239f71b8aacc"

DEPENDS = " \
    zlib \
    util-linux \
"

inherit autotools pkgconfig binconfig

FILES:${PN} += "${datadir}"

do_install:append() {
	sed -i \
		-e 's|^SET(prefix "${prefix}")|GET_FILENAME_COMPONENT(_xapian_prefix "${CMAKE_CURRENT_LIST_DIR}/../../.." ABSOLUTE)|' \
		-e '/^SET(exec_prefix /d' \
		-e 's|"${libdir}/libxapian.so"|"xapian"|' \
		-e 's|"${libdir}/libxapian.a"|"xapian"|' \
		-e 's|"${includedir}"|"${_xapian_prefix}/include"|' \
		${D}${libdir}/cmake/xapian/xapian-config.cmake
}
