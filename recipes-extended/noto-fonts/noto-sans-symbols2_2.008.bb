SUMMARY = "Noto Sans Symbols 2 font"
HOMEPAGE = "https://github.com/notofonts/symbols"
LICENSE = "OFL-1.1"
LIC_FILES_CHKSUM = "file://OFL.txt;md5=dc4831ae01aceada1ebe8f4917cdbc1b"

SRC_URI = "https://github.com/notofonts/symbols/releases/download/NotoSansSymbols2-v${PV}/NotoSansSymbols2-v${PV}.zip"
SRC_URI[sha256sum] = "346c930bbe8eb946701a05c54e9c11a2094dee1d93c387bf1771c0a3e335688f"

inherit fontcache

S = "${UNPACKDIR}"

do_install() {
	install -d ${D}${datadir}/fonts/truetype
	install -m644 ${S}/NotoSansSymbols2/hinted/ttf/NotoSansSymbols2-Regular.ttf ${D}${datadir}/fonts/truetype
}

FILES:${PN} = "${datadir}/fonts/truetype"
