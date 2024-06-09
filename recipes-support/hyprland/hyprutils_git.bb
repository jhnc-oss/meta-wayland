SUMMARY = "Hyprland c++ utils"
HOMEPAGE = "https:/github.com/hyprwm/hyputils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprutils.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "fce960f0dd1120057d604a6389211797be836762"
PV = "0.1.1"

inherit cmake
