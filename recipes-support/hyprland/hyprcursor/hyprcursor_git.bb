SUMMARY = "The hyprland cursor format, library and utilities."
HOMEPAGE = "https://github.com/hyprwm/hyprcursor"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprcursor.git;protocol=https;branch=main"

DEPENDS = "cairo librsvg libzip hyprlang tomlplusplus"

S = "${WORKDIR}/git"
SRCREV = "f388aacd22be4a6e4d634fbaf6f75eb0713d239a"
PV = "0.1.10"

inherit cmake pkgconfig
