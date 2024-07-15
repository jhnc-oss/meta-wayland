SUMMARY = "Hyprland c++ utils"
HOMEPAGE = "https:/github.com/hyprwm/hyputils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman"

SRC_URI = "git://github.com/hyprwm/hyprutils.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "eb1ceff2b87f6820789249f63faa8e9dcb54d05f"
PV = "0.2.0"

inherit cmake pkgconfig
