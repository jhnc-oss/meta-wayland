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
	xwayland \
	libxcb \
	xcb-util-wm \
	wlroots-0.19 \
	scenefx \
"

inherit meson pkgconfig

SRCREV = "775931a4e1dc12779b67ed9561433e0715b59ba4"

FILES:${PN} += "${datadir}/wayland-sessions/mango.desktop"
