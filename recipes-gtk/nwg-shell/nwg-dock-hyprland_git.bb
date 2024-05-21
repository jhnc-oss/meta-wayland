SUMMARY = "GTK3-based dock for hyprland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"
RDEPENDS:${PN} = "go-runtime"

GO_IMPORT = "github.com/nwg-piotr/nwg-dock-hyprland.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=src/${GO_IMPORT};nobranch=1;protocol=https"

PV = "0.1.9"
SRCREV = "d4cd7439ebfb29238674b94deb120695dd1425f1"
S = "${UNPACKDIR}"

inherit go go-mod pkgconfig

GO_INSTALL = "${GO_IMPORT}"
GO_LINKSHARED = ""

do_install:append() {
	# remove precompiled x86 binaries
	rm -rf ${D}${libdir}/go/src/${GO_IMPORT}/bin
	rm -rf ${D}${libdir}/go/pkg/mod/github.com/dlasky/gotk3-layershell*/example
	install -d ${D}${datadir}/nwg-dock-hyprland
	install -m 0644 ${S}/src/${GO_IMPORT}/config/style.css ${D}${datadir}/nwg-dock-hyprland
	cp -rf ${S}/src/${GO_IMPORT}/images ${D}${datadir}/nwg-dock-hyprland
}

do_compile[network] = "1"
