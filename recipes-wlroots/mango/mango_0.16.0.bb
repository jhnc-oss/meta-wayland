SUMMARY = "Mango Wayland Compositor"
HOMEPAGE = "https://github.com/DreamMaoMao/mangowc"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ebe939942f5c8cd8a40069c798619a8"

SRC_URI = "git://github.com/mangowm/mango.git;protocol=https;nobranch=1"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	cjson \
	libinput \
	libdrm \
	libxkbcommon \
	pixman \
	libdisplay-info \
	libliftoff \
	hwdata \
	seatd \
	pcre2 \
	wlroots-0.20 \
	scenefx \
"

inherit meson pkgconfig

SRCREV = "7bb3f7e38564e7dcae0d0a7bc01695e6ffcde2c0"

PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland libxcb xcb-util-wm"
PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xwayland', '', d)}"

FILES:${PN} += "${datadir}/wayland-sessions/mango.desktop ${datadir}/xdg-desktop-portal/mango-portals.conf"

RDEPENDS:${PN} += "xdg-desktop-portal-gtk"
