SUMMARY = "A small, clean C library that provides Unicode normalization, case-folding, and other operations for data in the UTF-8 encoding."
HOMEPAGE = "https://github.com/JuliaStrings/utf8proc"
BUGTRACKER = "https://github.com/JuliaStrings/utf8proc/issues"
SECTION = "base/shell"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=96d5a3ba306e0f24fb289427af484408"

SRC_URI = " \
	git://github.com/JuliaStrings/utf8proc.git;protocol=https;branch=master \
"

PV = "2.8.0"
SRCREV = "1cb28a66ca79a0845e99433fd1056257456cef8b"

EXTRA_OEMAKE = "prefix=${prefix} DESTDIR=${D}"

do_compile() {
	oe_runmake
}

do_install() {
	oe_runmake install
}
