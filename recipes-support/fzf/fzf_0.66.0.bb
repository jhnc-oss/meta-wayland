SUMMARY = "A command-line fuzzy finder"
HOMEPAGE = "https://github.com/junegunn/fzf.git"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=4e11c26cb155f78c5467051a82533faa"

GO_IMPORT = "github.com/junegunn/fzf"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src/${GO_IMPORT};branch=master;protocol=https"

SRCREV = "8cdfb23df69df0a991d122185b00e8900875a8cf"

require ${PN}-go-mods.inc ${PN}-licenses.inc

inherit go-mod go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"

