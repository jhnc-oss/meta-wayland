SUMMARY = "Graphical console greeter for greetd"
HOMEPAGE = "https://github.com/apognu/tuigreet.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/apognu/tuigreet.git;protocol=https;nobranch=1"
SRCREV = "4ca29169e56d428d0f936ce7dbead7c02cedf9ab"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc

RDEPENDS:${PN} = "greetd"
