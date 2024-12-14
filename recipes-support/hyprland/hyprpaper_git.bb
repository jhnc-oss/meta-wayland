SUMMARY = "Hyprpaper is a blazing fast wallpaper utility for Hyprland."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=936078e4e67b0e1e1bd1e862d4ffbc25"

SRC_URI = "git://github.com/hyprwm/hyprpaper.git;protocol=https;branch=main"

PV = "0.7.2"
SRCREV = "5b763f16181d4f1f4be7dd7fb0c5ecfd0f758cb7"
S = "${WORKDIR}/git"

DEPENDS += " \
	cairo \
	file \
	fribidi \
	hyprlang \
	hyprgraphics \
	hyprwayland-scanner-native \
	jpeg \
	libjxl \
	libglvnd \
	libwebp \
	pango \
	wayland \
	wayland-native \
	wayland-protocols \
"

RDEPENDS:${PN} = "hyprlang"

REQUIRED_DISTRO_FEATURES = "wayland"

inherit cmake pkgconfig features_check

FILES:${PN} += "${systemd_user_unitdir}"
