SUMMARY = "This tool creates a palette of up to 36 colours out of a jpg or png image."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = " \
	git://github.com/nwg-piotr/azote-palettes.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = " \
	python3 \
	python3-pygobject \
	python3-pillow \
	python3-colorthief \
"

inherit setuptools3

SRCREV = "a4116c840db361890737cb0eb5ebbe378f03e9c1"

