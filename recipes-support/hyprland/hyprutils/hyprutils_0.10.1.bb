SUMMARY = "Hyprland c++ utils"
HOMEPAGE = "https:/github.com/hyprwm/hyputils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman"

SRC_URI = "git://github.com/hyprwm/hyprutils.git;protocol=https;branch=main"

SRCREV = "01afe9245b54f090886720df908a9a4c58a4a63b"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"

PACKAGECONFIG ?= ""
PACKAGECONFIG[tests] = "-DBUILD_TESTING=ON,-DBUILD_TESTING=OFF,googletest"
