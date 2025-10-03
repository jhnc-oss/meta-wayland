SUMMARY = "Hyprland c++ utils"
HOMEPAGE = "https:/github.com/hyprwm/hyputils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman"

SRC_URI = "git://github.com/hyprwm/hyprutils.git;protocol=https;branch=main"

SRCREV = "c1f541256e86343f87678826148e1a36290b02e9"

inherit cmake pkgconfig
