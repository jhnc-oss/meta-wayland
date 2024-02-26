SUMMARY = "Hyprland's idle daemon"
HOMEPAGE = "https:/github.com/hyprwm/hypridle"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hypridle.git;protocol=https;branch=main"

DEPENDS = "wayland wayland-native wayland-protocols hyprlang sdbus-c++"

S = "${WORKDIR}/git"
SRCREV = "b85722e41aeb9925f248e9b3fe8427475cb1eb6b"
PV = "0.1.0"

inherit cmake pkgconfig
