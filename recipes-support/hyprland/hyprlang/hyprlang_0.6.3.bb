SUMMARY = "The hypr configuration language is an extremely efficient, yet easy to work with, configuration language for linux applications."
HOMEPAGE = "https:/github.com/hyprwm/hyprlang"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b5b6bed06dd8ed68f00c26d0b4cede89"

DEPENDS = "hyprutils"

SRC_URI = "git://github.com/hyprwm/hyprlang.git;protocol=https;branch=main"

SRCREV = "3d63fb4a42c819f198deabd18c0c2c1ded1de931"

inherit cmake pkgconfig
