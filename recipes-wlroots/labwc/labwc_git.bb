
SUMMARY = "Labwc stands for Lab Wayland Compositor"
HOMEPAGE = "https://github.com/labwc/labwc"
SECTION = "graphics"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	libxml2 \
	libsfdo \
	glib-2.0 \
	cairo \
	pango \
	wayland \
	wayland-native \
	wayland-protocols \
	libdrm \
	libxkbcommon \
	libinput \
	wlroots-0.18 \
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

SRCREV = "6bd36e85122101b30a852723b33d72210d45f8a5"
PV = "0.8.1"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check gettext

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'xwayland', d)}"

PACKAGECONFIG[man-pages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm xcb-util-renderutil xwayland,xwayland"

FILES:${PN} += "${datadir}"

