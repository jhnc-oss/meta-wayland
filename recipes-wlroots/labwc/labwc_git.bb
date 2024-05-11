
SUMMARY = "Labwc stands for Lab Wayland Compositor"
HOMEPAGE = "https://github.com/labwc/labwc"
SECTION = "graphics"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	libxml2 \
	glib-2.0 \
	cairo \
	pango \
	wayland \
	wayland-native \
	wayland-protocols \
	libdrm \
	libxkbcommon \
	libinput \
	wlroots-0.17 \
"

RRECOMMENDS:${PN} ?= " \
	foot \
	grim \
	slurp \
	wl-clipboard \
	labwc-menu-generator \
	labwc-tweaks-gtk \
	swaybg \
"

SRC_URI = "git://github.com/labwc/labwc.git;protocol=https;branch=master"

SRCREV = "b41af54a1bd7d9270d19de4c9a2b77d882cf3ede"
PV = "0.7.2"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check gettext

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'xwayland', d)}"

PACKAGECONFIG[man-pages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm xcb-util-renderutil xwayland,xwayland"

FILES:${PN} += "${datadir}"

