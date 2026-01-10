SUMMARY = "Nerd fonts - Symbols Only"
LICENSE = "OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a4872f050df7934fcdccc9d296b38905"

SRC_URI = "https://raw.githubusercontent.com/ryanoasis/nerd-fonts/v${PV}/patched-fonts/NerdFontsSymbolsOnly/SymbolsNerdFont-Regular.ttf;name=regular"
SRC_URI += "https://raw.githubusercontent.com/ryanoasis/nerd-fonts/v${PV}/patched-fonts/NerdFontsSymbolsOnly/SymbolsNerdFontMono-Regular.ttf;name=mono"
SRC_URI += "https://raw.githubusercontent.com/ryanoasis/nerd-fonts/v${PV}/LICENSE;name=license"

SRC_URI[regular.sha256sum] = "71db104aa66567d0efe0b98758f9dfc1895573a453fe85fb53d1c38544a55106"
SRC_URI[mono.sha256sum] = "f0f624d9b474bea1662cf7e862d44aebe1ae1f6c7f9cb7a0ca5d0e5ac9561c60"
SRC_URI[license.sha256sum] = "1f6ad4edae6479aaace3112ede5279a23284ae54b2a34db66357aef5f64df160"

inherit fontcache

S = "${UNPACKDIR}"

do_install() {
	install -d ${D}${datadir}/fonts/truetype
	for file in ${S}/*.ttf; do
		install -m644 $file ${D}${datadir}/fonts/truetype
	done
}

FILES:${PN} = "${datadir}/fonts/truetype"
