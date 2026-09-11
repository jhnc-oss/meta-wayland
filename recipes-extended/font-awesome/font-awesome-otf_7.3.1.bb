SUMMARY = "Font Awesome"

HOMEPAGE = "https://fontawesome.com/"
SECTION = "base/fonts"

LICENSE = "CC-BY-4.0 AND OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f36af1c24ccf20e8805e40b6da8842b9"

SRC_URI = " \
	git://github.com/FortAwesome/Font-Awesome.git;protocol=https;nobranch=1;tag=7.3.1 \
"

SRCREV = "14c65a3747d0f3b751f15831fc719236aea8729d"


do_install () {
	install -d ${D}${datadir}/fonts/opentype
	for font in ${S}/otfs/*.otf; do
		install -m 0644  "$font" ${D}${datadir}/fonts/opentype
	done
}

FILES:${PN} = " \
	${datadir}/fonts \
"

