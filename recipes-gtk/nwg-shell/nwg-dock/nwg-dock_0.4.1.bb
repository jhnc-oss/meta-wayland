SUMMARY = "GTK3-based dock for wlroots based compositors."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"
RDEPENDS:${PN} = "go-runtime"

GO_IMPORT = "github.com/nwg-piotr/nwg-dock.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BP}/src/${GO_IMPORT};nobranch=1;protocol=https"

SRCREV = "3f010171ab8596552efdc2f03d5f09c0042bbb64"

require nwg-dock-go-mods.inc nwg-dock-licenses.inc

inherit go go-mod pkgconfig go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"
GO_LINKSHARED = ""

do_install:append() {
	# remove precompiled x86 binaries
	rm -rf ${D}${libdir}/go/src/${GO_IMPORT}/bin
	rm -rf ${D}${libdir}/go/pkg/mod/github.com/dlasky/gotk3-layershell*/example
}
