SUMMARY = "A command-line fuzzy finder"
HOMEPAGE = "https://github.com/junegunn/fzf.git"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=4e11c26cb155f78c5467051a82533faa"

GO_IMPORT = "github.com/junegunn/fzf"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src/${GO_IMPORT};branch=master;protocol=https"

SRCREV = "2ab923f3ae04d5e915e5ff4a9cd3bd515bfd1ea5"

require ${PN}-go-mods.inc ${PN}-licenses.inc

inherit go-mod go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"

