SUMMARY = "resvg is an SVG rendering library"
HOMEPAGE = "https://github.com/linebender/resvg"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=23f3330d0ac4521d09ec0366c4e6cc25"

SRC_URI = "git://github.com/linebender/resvg.git;protocol=https;branch=main"
SRCREV = "3a0fdba53ccf2d346b54cc53ba7adf0ee60d0707"
PV = "0.47.0"

inherit cargo_c cargo-update-recipe-crates

require resvg-crates.inc

CARGO_BUILD_FLAGS += "--workspace"
