SUMMARY = "GTK3-based application launcher for wlroots based compositors."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=0bfb54bb2e805f7da490004ef8a2adab"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"

RDEPENDS:${PN} = "go-runtime"

GO_IMPORT = "github.com/nwg-piotr/nwg-drawer.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BP}/src/${GO_IMPORT};nobranch=1;protocol=https"

SRCREV = "b6209d5ab30da1c4beadd22fb2a9a63bf1ef607b"

require nwg-drawer-go-mods.inc nwg-drawer-licenses.inc

inherit go go-mod pkgconfig go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"
GO_LINKSHARED = ""

do_install:append() {
	# remove precompiled x86 binary
	rm -rf ${D}${libdir}/go/src/${GO_IMPORT}/bin
	rm -rf ${D}${libdir}/go/pkg/mod/github.com/dlasky/gotk3-layershell*/example
}
