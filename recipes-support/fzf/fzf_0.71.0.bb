SUMMARY = "A command-line fuzzy finder"
HOMEPAGE = "https://github.com/junegunn/fzf.git"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=edd55e9a395baee52799d6fb23fef6e5"

GO_IMPORT = "github.com/junegunn/fzf"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src/${GO_IMPORT};branch=master;protocol=https"

SRCREV = "62899fd74eb4f5a12ca973d30fb356431d68f9c2"

require ${PN}-go-mods.inc ${PN}-licenses.inc

inherit go-mod go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"

