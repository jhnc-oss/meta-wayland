SUMMARY = "JetBrainsMono Nerd font"
LICENSE = "OFL-1.1"
LIC_FILES_CHKSUM = "file://OFL.txt;md5=43dc1a748ef82aa746d6a645d52578a9"

SRC_URI = "https://github.com/ryanoasis/nerd-fonts/releases/download/v${PV}/JetBrainsMono.zip"
SRC_URI[sha256sum] = "76f05ff3ace48a464a6ca57977998784ff7bdbb65a6d915d7e401cd3927c493c"

inherit allarch fontcache

S = "${UNPACKDIR}"

do_install() {
	install -d ${D}${datadir}/fonts/truetype
	for file in ${S}/*.ttf; do
		install -m644 $file ${D}${datadir}/fonts/truetype
	done
	install -d ${D}${datadir}/doc/${BPN}/
	install -m 0644 OFL.txt ${D}${datadir}/doc/${BPN}/
}

FILES:${PN} = "${datadir}/fonts/truetype ${datadir}/doc"
