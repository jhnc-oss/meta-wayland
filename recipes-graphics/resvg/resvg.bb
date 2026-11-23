SUMMARY = "resvg CLI application to render static SVG files"
HOMEPAGE = "https://github.com/linebender/resvg"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=23f3330d0ac4521d09ec0366c4e6cc25"

SRC_URI = "git://github.com/linebender/resvg.git;protocol=https;branch=main;tag=v${PV}"
SRCREV = "5bdbae64eefadc4bf0caa56dcf91702037929086"
PV = "0.50.0"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc
