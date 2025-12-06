SUMMARY = "Hyprland c++ utils"
HOMEPAGE = "https:/github.com/hyprwm/hyputils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman"

SRC_URI = "git://github.com/hyprwm/hyprutils.git;protocol=https;branch=main"

SRCREV = "fe686486ac867a1a24f99c753bb40ffed338e4b0"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"

PACKAGECONFIG ?= ""
PACKAGECONFIG[tests] = "-DBUILD_TESTING=ON,-DBUILD_TESTING=OFF,googletest"
