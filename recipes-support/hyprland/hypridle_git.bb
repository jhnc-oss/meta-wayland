SUMMARY = "Hyprland's idle daemon"
HOMEPAGE = "https:/github.com/hyprwm/hypridle"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hypridle.git;protocol=https;branch=main"

DEPENDS = "wayland wayland-native wayland-protocols hyprlang sdbus-c++-1"

S = "${WORKDIR}/git"
SRCREV = "cc23f97836adbba1abc8edd48169fb1f1f698c32"
PV = "0.1.2"

inherit cmake pkgconfig

FILES:${PN} += "${systemd_user_unitdir} ${datadir}/hypr/hypridle.conf"
