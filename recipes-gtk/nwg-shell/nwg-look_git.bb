SUMMARY = "Nwg-look is a GTK3 settings editor, designed to work properly in wlroots-based Wayland environment."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=453b3e96b1052c0e1d1460b0134b9287"

DEPENDS = "xcur2png gtk+3"
RDEPENDS:${PN} = "xcur2png go-runtime"

GO_IMPORT = "github.com/nwg-piotr/nwg-look"

SRC_URI = "git://${GO_IMPORT};destsuffix=src/${GO_IMPORT};branch=main;protocol=https"
SRCREV = "88f2639445084bf265ad71dba1c7af507c471762"
PV = "0.2.7"
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

inherit go go-mod pkgconfig gtk-icon-cache

GO_INSTALL = "${GO_IMPORT}"

GO_LINKSHARED = ""

do_install:append() {
	install -d ${D}${datadir}/nwg-look/langs ${D}${datadir}/applications ${D}${datadir}/pixmaps
	install -m 0644 ${S}/src/${GO_IMPORT}/stuff/main.glade ${D}${datadir}/nwg-look
	install -m 0644 ${S}/src/${GO_IMPORT}/stuff/nwg-look.desktop ${D}${datadir}/applications
	install -m 0644 ${S}/src/${GO_IMPORT}/stuff/nwg-look.svg ${D}${datadir}/pixmaps
	install -m 0644 ${S}/src/${GO_IMPORT}/langs/en_US.json ${D}${datadir}/nwg-look/langs
}

FILES:${PN} += "${datadir}"

do_compile[network] = "1"

