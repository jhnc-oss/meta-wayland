SUMMARY = "resvg CLI application to render static SVG files"
HOMEPAGE = "https://github.com/linebender/resvg"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=23f3330d0ac4521d09ec0366c4e6cc25"

SRC_URI = "git://github.com/linebender/resvg.git;protocol=https;branch=main;tag=v0.48.1"
SRCREV = "68b14c4c3bccdb60344c777406486b54c36ec1a4"
PV = "0.48.1"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc
