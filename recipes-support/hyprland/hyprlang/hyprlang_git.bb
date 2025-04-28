SUMMARY = "The hypr configuration language is an extremely efficient, yet easy to work with, configuration language for linux applications."
HOMEPAGE = "https:/github.com/hyprwm/hyprlang"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b5b6bed06dd8ed68f00c26d0b4cede89"

DEPENDS = "hyprutils"

SRC_URI = "git://github.com/hyprwm/hyprlang.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "f1000c54d266e6e4e9d646df0774fac5b8a652df"
PV = "0.6.1"

inherit cmake pkgconfig
