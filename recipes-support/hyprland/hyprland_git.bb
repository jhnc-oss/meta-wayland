SUMMARY = "A Wayland WM"
HOMEPAGE = "https://hyprland.org/"
SECTION = "graphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e5285450935e9c47f839569c8cbd4e29"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	aquamarine \
	cairo \
	hyprcursor \
	hyprlang \
	hyprutils \
	jq-native \
	libdrm \
	libinput \
	libxcursor \
	libxcb \
	libxkbcommon \
	pango \
	pixman \
	tomlplusplus \
	util-linux-libuuid \
	virtual/egl \
	wayland-native \
	xcb-util-wm \
	xcb-util-renderutil \
	xcb-util-errors \
	hyprwayland-scanner-native \
"

RRECOMMENDS:${PN} ?= " \
	foot \
	jq \
	grim \
	slurp \
	wl-clipboard \
	hyprland-contrib \
"

SRC_URI = "gitsm://github.com/hyprwm/Hyprland.git;protocol=https;branch=main"

SRCREV = "0f594732b063a90d44df8c5d402d658f27471dfe"
PV = "0.43"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd xwayland', d)}"

PACKAGECONFIG[systemd] = "-Dsystemd=enabled,-Dsystemd=disabled"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm xcb-util-renderutil xwayland,xwayland"
PACKAGECONFIG[legacy_renderer] = "-Dlegacy_renderer=enabled,-Dlegacy_renderer=disabled"

do_configure:prepend() {
	cd ${S} && scripts/generateVersion.sh
}

FILES:${PN} += "${datadir}"

