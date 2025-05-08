SUMMARY = "Hyprpaper is a blazing fast wallpaper utility for Hyprland."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=936078e4e67b0e1e1bd1e862d4ffbc25"

SRC_URI = "git://github.com/hyprwm/hyprpaper.git;protocol=https;branch=main"

PV = "0.7.5"
SRCREV = "753ffa7fe9b6211609c263e38e09ae663a762b56"
S = "${WORKDIR}/git"

DEPENDS += " \
	cairo \
	fribidi \
	hyprlang \
	hyprutils \
	hyprgraphics \
	hyprwayland-scanner-native \
	libglvnd \
	pango \
	wayland \
	wayland-native \
	wayland-protocols \
"

RDEPENDS:${PN} = "hyprlang"

REQUIRED_DISTRO_FEATURES = "wayland"

inherit cmake pkgconfig features_check

FILES:${PN} += "${systemd_user_unitdir}"
