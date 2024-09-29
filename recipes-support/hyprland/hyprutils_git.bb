SUMMARY = "Hyprland c++ utils"
HOMEPAGE = "https:/github.com/hyprwm/hyputils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman"

SRC_URI = "git://github.com/hyprwm/hyprutils.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "7373e8721502bfe696efbe3b7c350335eb0c1fc9"
PV = "0.2.3"

inherit cmake pkgconfig
