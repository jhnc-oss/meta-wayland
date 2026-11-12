SUMMARY = "The hyprland cursor format, library and utilities."
HOMEPAGE = "https://github.com/hyprwm/hyprcursor"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprcursor.git;protocol=https;branch=main;tag=v${PV}"

DEPENDS = "cairo librsvg libzip hyprlang tomlplusplus"

SRCREV = "9e6916077f3c6c20419e8e405c51952fc37aaa5b"

inherit cmake pkgconfig
