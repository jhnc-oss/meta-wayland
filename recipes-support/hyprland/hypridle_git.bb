SUMMARY = "Hyprland's idle daemon"
HOMEPAGE = "https:/github.com/hyprwm/hypridle"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hypridle.git;protocol=https;branch=main"

DEPENDS = "wayland wayland-native wayland-protocols hyprlang sdbus-c++"

S = "${WORKDIR}/git"
SRCREV = "26780ac51f6e7273e3934885036b7a7ed1a5af01"
PV = "0.1.5"

inherit cmake pkgconfig

FILES:${PN} += "${systemd_user_unitdir} ${datadir}/hypr/hypridle.conf"
