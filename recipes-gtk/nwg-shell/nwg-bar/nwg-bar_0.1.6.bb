SUMMARY = "nwg-bar for wlroots based compositors."
DESCRIPTION = "The nwg-bar command creates a button bar on the basis of a JSON template placed in the ~/.config/nwg-bar/ folder."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=dcdbccfd08fcfd7002d16ca7fa5ad5cb"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"
RDEPENDS:${PN} = "go-runtime"

GO_IMPORT = "github.com/nwg-piotr/nwg-bar.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src/${GO_IMPORT};nobranch=1;protocol=https"

SRCREV = "c4da7d817747ad2f8cfda332d95bd4fc55eb6b34"

require ${PN}-go-mods.inc ${PN}-licenses.inc

inherit go go-mod pkgconfig go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"
GO_LINKSHARED = ""
