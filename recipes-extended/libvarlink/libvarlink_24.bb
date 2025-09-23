SUMMARY = "varlink is an interface description format and protocol accessible to both humans and machines."
HOMEPAGE = "https://varlink.org"
LICENSE = "Apache-2.0 & BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = " \
	git://github.com/varlink/libvarlink.git;protocol=https;branch=master \
"

inherit meson

SRCREV = "8d38ff96b223b1fded9cfd8955e9d4027c6abfc6"

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

