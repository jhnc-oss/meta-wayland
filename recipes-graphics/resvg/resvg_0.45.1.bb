SUMMARY = "resvg is an SVG rendering library"
HOMEPAGE = "https://github.com/linebender/resvg"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=23f3330d0ac4521d09ec0366c4e6cc25"

SRC_URI = "git://github.com/linebender/resvg.git;protocol=https;branch=main"

SRCREV = "1b6c2fddbcbeffa8135df4323b02aaae84890907"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc
