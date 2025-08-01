SUMMARY = "A simple tool suitable for adjusting external monitor's brightness"
HOMEPAGE = "https://github.com/lilydjwg/monitor-control"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI += "git://github.com/lilydjwg/monitor-control.git;protocol=https;nobranch=1"
SRCREV = "2059740f5063ed87fec6558fa720015f9080fc4c"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc

