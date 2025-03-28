SUMMARY = "Hyprland's idle daemon"
HOMEPAGE = "https:/github.com/hyprwm/hypridle"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hypridle.git;protocol=https;branch=main"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	hyprwayland-scanner-native \
	hyprlang sdbus-c++ \
	hyprland-protocols \
"

S = "${WORKDIR}/git"
SRCREV = "84f9f2e127dba49c9bffe293f46bed400e0034a0"
PV = "0.1.6"

inherit cmake pkgconfig

FILES:${PN} += "${systemd_user_unitdir} ${datadir}/hypr/hypridle.conf"
