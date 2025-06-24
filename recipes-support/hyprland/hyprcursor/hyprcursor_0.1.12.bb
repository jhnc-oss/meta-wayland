SUMMARY = "The hyprland cursor format, library and utilities."
HOMEPAGE = "https://github.com/hyprwm/hyprcursor"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprcursor.git;protocol=https;branch=main"

DEPENDS = "cairo librsvg libzip hyprlang tomlplusplus"

SRCREV = "028bedbc63bf87937ce8f61f2a125fcc4929a98a"

inherit cmake pkgconfig
