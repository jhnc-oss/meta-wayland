SUMMARY = "The hypr configuration language is an extremely efficient, yet easy to work with, configuration language for linux applications."
HOMEPAGE = "https:/github.com/hyprwm/hyprlang"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b5b6bed06dd8ed68f00c26d0b4cede89"

SRC_URI = "git://github.com/hyprwm/hyprlang.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "78fcaa27ae9e1d782faa3ff06c8ea55ddce63706"
PV = "0.5.1"

inherit cmake
