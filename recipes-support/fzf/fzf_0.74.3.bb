SUMMARY = "A command-line fuzzy finder"
HOMEPAGE = "https://github.com/junegunn/fzf.git"
LICENSE = "BSD-3-Clause AND MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=edd55e9a395baee52799d6fb23fef6e5"

GO_IMPORT = "github.com/junegunn/fzf"

SRC_URI = "git://${GO_IMPORT};destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src/${GO_IMPORT};branch=master;protocol=https;tag=v0.74.3"

SRCREV = "15f64c492a08f0840b81540c7d1de35737448086"

require ${PN}-go-mods.inc ${PN}-licenses.inc

inherit go-mod go-mod-update-modules

GO_INSTALL = "${GO_IMPORT}"

