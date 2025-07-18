SUMMARY = "Azote is a GTK+3 based frontend for swaybg."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = " \
	git://github.com/nwg-piotr/azote.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = " \
	azote-palettes \
	python3 \
	gtk+3 \
	python3-pygobject \
	python3-pycairo \
	python3-pillow \
	python3-pkg-resources \
	python3-send2trash \
	grim \
	slurp \
	swaybg \
	wlr-randr \
"

inherit setuptools3

SRCREV = "2ae47b79b555c9c1152683efff8cbc7a7fac7d6e"

do_install:append() {
	install -d ${D}${datadir}/azote ${D}${datadir}/pixmaps ${D}${datadir}/applications
	install -m 644 ${S}/dist/azote.desktop ${D}${datadir}/applications
	install -m 644 ${S}/dist/azote.svg ${D}${datadir}/pixmaps
	install -m 644 ${S}/dist/indicator_active.png ${D}${datadir}/azote
	install -m 644 ${S}/dist/indicator_attention.png ${D}${datadir}/azote
}

FILES:${PN} += "${datadir}"
