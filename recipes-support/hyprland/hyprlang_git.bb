SUMMARY = "The hypr configuration language is an extremely efficient, yet easy to work with, configuration language for linux applications."
HOMEPAGE = "https:/github.com/hyprwm/hyprlang"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b5b6bed06dd8ed68f00c26d0b4cede89"

SRC_URI = "git://github.com/hyprwm/hyprlang.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "9995f54eddb20de2123bc45c020ac124654c1111"
PV = "0.4.2"

inherit cmake
