SUMMARY = "MenuStart plugin to nwg-panel."
DESCRIPTION = "This code provides the MenuStart plugin to nwg-panel. It \
also may be used standalone with a little help from command line arguments."
LICENSE = "BSD-3-Clause AND ISC AND MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"

RRECOMMENDS:${PN} = " \
	foot \
"

GO_IMPORT = "github.com/nwg-piotr/nwg-menu.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src/${GO_IMPORT};nobranch=1;protocol=https;tag=v0.1.9"

SRCREV = "208b082f7d459d12ffd44634259fad94060ccbea"

require ${PN}-go-mods.inc ${PN}-licenses.inc

inherit go go-mod pkgconfig go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"
GO_LINKSHARED = ""

do_install:append() {
	# remove precompiled x86 binary
	rm -rf ${D}${libdir}/go/src/${GO_IMPORT}/bin
}

