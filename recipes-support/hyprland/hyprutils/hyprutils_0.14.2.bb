SUMMARY = "Hyprland c++ utils"
HOMEPAGE = "https:/github.com/hyprwm/hyputils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman"

SRC_URI = "git://github.com/hyprwm/hyprutils.git;protocol=https;branch=main;tag=v0.14.2"
SRCREV = "a21e87b878e72ee5dfd375899e8b2ad0d0c4c0e1"

inherit cmake pkgconfig

BBCLASSEXTEND = "native"

PACKAGECONFIG ?= ""
PACKAGECONFIG[tests] = "-DBUILD_TESTING=ON,-DBUILD_TESTING=OFF,googletest"
