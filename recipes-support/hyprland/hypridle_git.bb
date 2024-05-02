SUMMARY = "Hyprland's idle daemon"
HOMEPAGE = "https:/github.com/hyprwm/hypridle"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hypridle.git;protocol=https;branch=main"

DEPENDS = "wayland wayland-native wayland-protocols hyprlang sdbus-c++-1"

S = "${WORKDIR}/git"
SRCREV = "7cff4581a3753154fc5b41f39a098fad49b777b1"
PV = "0.1.2"

inherit cmake pkgconfig

FILES:${PN} += "${systemd_user_unitdir}"
