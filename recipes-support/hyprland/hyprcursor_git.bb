SUMMARY = "The hyprland cursor format, library and utilities."
HOMEPAGE = "https://github.com/hyprwm/hyprcursor"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprcursor.git;protocol=https;branch=main"

DEPENDS = "cairo librsvg libzip hyprlang tomlplusplus"

S = "${WORKDIR}/git"
SRCREV = "c18572a92eb39e4921b4f4c2bca8521b6f701b58"
PV = "0.1.10"

inherit cmake pkgconfig
