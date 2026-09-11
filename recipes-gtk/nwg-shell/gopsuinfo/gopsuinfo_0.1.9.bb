SUMMARY = "Go version of the psuinfo python script."
LICENSE = "BSD-2-Clause AND BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=22ed6cb3c33862e689e075b45066a779"

GO_IMPORT = "github.com/nwg-piotr/gopsuinfo.git"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src/${GO_IMPORT};branch=main;protocol=https;tag=v0.1.9"
SRCREV = "9ce93f65ef430cccf5dd7e6ac618430c2e2d00a3"

inherit go go-mod go-mod-update-modules

require ${PN}-go-mods.inc ${PN}-licenses.inc

GO_INSTALL = "${GO_IMPORT}"
GO_LINKSHARED = ""

