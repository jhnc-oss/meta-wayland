SUMMARY = "Clipboard history “manager” for Wayland"
LICENSE = "BSD-3-Clause AND GPL-3.0-only AND MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

GO_IMPORT = "github.com/sentriz/cliphist.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src/${GO_IMPORT};nobranch=1;protocol=https;tag=v0.7.0"
SRCREV = "efb61cb5b5a28d896c05a24ac83b9c39c96575f2"

require ${PN}-go-mods.inc ${PN}-licenses.inc

inherit go go-mod go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"

RDEPENDS:${PN} = "wl-clipboard"
RDEPENDS:${PN}-dev = "bash"
