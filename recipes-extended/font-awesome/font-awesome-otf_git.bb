SUMMARY = "Font Awesome"

HOMEPAGE = "https://fontawesome.com/"
SECTION = "base/fonts"

LICENSE = "CC-BY-4.0 & OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9b9d97c72a232b7715f2aed4bf4a4d45"

SRC_URI = " \
	git://github.com/FortAwesome/Font-Awesome.git;protocol=https;branch=6.x \
"

S = "${WORKDIR}/git"
PV = "6.5.2"
SRCREV = "c0f460dca7f7688761120415ff3c9cf7f73119be"


do_install () {
	install -d ${D}${datadir}/fonts/opentype
	for font in ${S}/otfs/*.otf; do
		install -m 0644  "$font" ${D}${datadir}/fonts/opentype
	done
}

FILES:${PN} = " \
	${datadir}/fonts \
"

