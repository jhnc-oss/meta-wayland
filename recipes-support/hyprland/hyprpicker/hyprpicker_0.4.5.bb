SUMMARY = "A wlroots-compatible Wayland color picker that does not suck."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=936078e4e67b0e1e1bd1e862d4ffbc25"

SRC_URI = "git://github.com/hyprwm/hyprpicker.git;protocol=https;branch=main"
SRCREV = "b645b892b14d0f55be7636555044836ec57c6d06"

DEPENDS = " \
	cairo \
	fribidi \
	hyprutils \
	hyprwayland-scanner \
	hyprwayland-scanner-native \
	jpeg \
	libxkbcommon \
	pango \
	pcre \
	util-linux \
	wayland \
	wayland-protocols \
"

RDEPENDS:${PN} = "wl-clipboard"

REQUIRED_DISTRO_FEATURES = "wayland"

EXTRA_OEMAKE = "-DCMAKE_BUILD_TYPE:STRING=Release"

inherit cmake pkgconfig features_check
