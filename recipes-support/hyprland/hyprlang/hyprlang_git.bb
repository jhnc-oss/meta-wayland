SUMMARY = "The hypr configuration language is an extremely efficient, yet easy to work with, configuration language for linux applications."
HOMEPAGE = "https:/github.com/hyprwm/hyprlang"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b5b6bed06dd8ed68f00c26d0b4cede89"

DEPENDS = "hyprutils"

SRC_URI = "git://github.com/hyprwm/hyprlang.git;protocol=https;branch=main"

SRCREV = "557241780c179cf7ef224df392f8e67dab6cef83"
PV = "0.6.3"

inherit cmake pkgconfig
