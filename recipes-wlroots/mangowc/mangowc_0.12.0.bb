SUMMARY = "Mango Wayland Compositor"
HOMEPAGE = "https://github.com/DreamMaoMao/mangowc"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ebe939942f5c8cd8a40069c798619a8"

SRC_URI = "git://github.com/DreamMaoMao/mangowc.git;protocol=https;nobranch=1"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	libinput \
	libdrm \
	libxkbcommon \
	pixman \
	libdisplay-info \
	libliftoff \
	hwdata \
	seatd \
	pcre2 \
	wlroots-0.19 \
	scenefx \
"

inherit meson pkgconfig

SRCREV = "5172444e08b2c2be24bef0b5ccff2d2367332118"

PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland libxcb xcbutil-wm"
PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xwayland', '', d)}"

FILES:${PN} += "${datadir}/wayland-sessions/mango.desktop"
