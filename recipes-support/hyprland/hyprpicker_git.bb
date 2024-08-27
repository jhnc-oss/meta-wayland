SUMMARY = "A wlroots-compatible Wayland color picker that does not suck."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=936078e4e67b0e1e1bd1e862d4ffbc25"

SRC_URI = "git://github.com/hyprwm/hyprpicker.git;protocol=https;branch=main"

PV = "0.3.0"
S = "${WORKDIR}/git"
SRCREV = "38fe668e58014c75cf28f7cb5fc136aa710e7039"

DEPENDS = " \
	cairo \
	fribidi \
	hyprutils \
	jpeg \
	libxkbcommon \
	pango \
	pcre \
	util-linux \
	wayland \
	wayland-native \
	wayland-protocols \
"

RDEPENDS:${PN} = "wl-clipboard"

REQUIRED_DISTRO_FEATURES = "wayland"

EXTRA_OEMAKE = "-DCMAKE_BUILD_TYPE:STRING=Release"

inherit cmake pkgconfig features_check
