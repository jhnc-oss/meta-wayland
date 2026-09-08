SUMMARY = "Graphical console greeter for greetd"
HOMEPAGE = "https://github.com/apognu/tuigreet.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/apognu/tuigreet.git;protocol=https;nobranch=1;tag=0.11.1"
SRCREV = "30bd91a650d5dfb261bf20cc1f437ce3b354296e"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc

RDEPENDS:${PN} = "greetd"
