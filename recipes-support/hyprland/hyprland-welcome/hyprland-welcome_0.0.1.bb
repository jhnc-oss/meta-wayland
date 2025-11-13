SUMMARY = "Hyprland's cute welcome app, written with hyprtoolkit"
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

SRC_URI = "git://github.com/hyprwm/hyprland-welcome.git;protocol=https;branch=main"
SRC_URI += "file://0001-CMakeLists.txt-dont-install-desktop-file.patch"

SRCREV = "7b565688322ecc3ecff1f89aabf453e9677df645"

DEPENDS = "hyprtoolkit pixman libdrm hyprutils"

inherit cmake pkgconfig
