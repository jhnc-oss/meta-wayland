SUMMARY = "ANSI HTML Adapter"
DESCRIPTION = "aha takes SGR-colored input and converts it to a static HTML file."
HOMEPAGE = "https://github.com/theZiz/aha"
SECTION = "console/utils"
LICENSE = "LGPL-2.0-or-later OR MPL-1.1"

LIC_FILES_CHKSUM = " \
	file://LICENSE.LGPLv2+;md5=37bbc293fb1f4778e2dd52b961918b95 \
	file://LICENSE.MPL1.1;md5=2045d4135df9e1df5f267747f95f317d \
"

SRC_URI = "git://github.com/theZiz/aha.git;protocol=https;nobranch=1;tag=${PV}"
SRCREV = "41c2320eb31ef1c95fcd45a0feb0303f606fc711"

do_install() {
	oe_runmake install PREFIX=${prefix} DESTDIR=${D}
}
