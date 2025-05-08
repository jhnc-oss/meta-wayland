SUMMARY = "Hyprland c++ utils"
HOMEPAGE = "https:/github.com/hyprwm/hyputils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman"

SRC_URI = "git://github.com/hyprwm/hyprutils.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "674ea57373f08b7609ce93baff131117a0dfe70d"
PV = "0.7.1"

inherit cmake pkgconfig
