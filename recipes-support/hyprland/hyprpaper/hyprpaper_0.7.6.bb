SUMMARY = "Hyprpaper is a blazing fast wallpaper utility for Hyprland."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=936078e4e67b0e1e1bd1e862d4ffbc25"

SRC_URI = "git://github.com/hyprwm/hyprpaper.git;protocol=https;branch=main"
SRC_URI += "file://0001-CMakeLists.txt-use-find_program-for-OpenGL.patch"

SRCREV = "1733e0025b194c9bc083f4cd8782c5f151858a58"

DEPENDS += " \
	cairo \
	fribidi \
	hyprlang \
	hyprutils \
	hyprgraphics \
	hyprwayland-scanner-native \
	virtual/egl \
	virtual/libgles2 \
	pango \
	wayland \
	wayland-native \
	wayland-protocols \
"

RDEPENDS:${PN} = "hyprlang"

REQUIRED_DISTRO_FEATURES = "wayland"

inherit cmake pkgconfig features_check

FILES:${PN} += "${systemd_user_unitdir}"

