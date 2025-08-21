SUMMARY = "Clipboard history “manager” for Wayland"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

GO_IMPORT = "github.com/sentriz/cliphist.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src/${GO_IMPORT};nobranch=1;protocol=https"
SRCREV = "8c48df70bb3d9d04ae8691513e81293ed296231a"

require ${PN}-go-mods.inc ${PN}-licenses.inc

inherit go go-mod go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"

RDEPENDS:${PN} = "wl-clipboard"
RDEPENDS:${PN}-dev = "bash"
