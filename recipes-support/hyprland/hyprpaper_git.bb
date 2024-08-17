SUMMARY = "Hyprpaper is a blazing fast wallpaper utility for Hyprland."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=936078e4e67b0e1e1bd1e862d4ffbc25"

SRC_URI = " \
	git://github.com/hyprwm/hyprpaper.git;protocol=https;branch=main \
	file://0001-CMakeLists-require-native-hyprwayland-scanner.patch \
"

PV = "0.7.1"
SRCREV = "808d88e5745e775763109e26502e951043349d5f"
S = "${WORKDIR}/git"

DEPENDS += " \
	cairo \
	file \
	fribidi \
	hyprlang \
	hyprwayland-scanner-native \
	jpeg \
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
