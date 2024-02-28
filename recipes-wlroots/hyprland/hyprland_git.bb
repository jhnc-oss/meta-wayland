
SUMMARY = "A Wayland WM"
HOMEPAGE = "https://hyprland.org/"
SECTION = "graphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a08367f3a4cd5301ba8b88eded36b8fd"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	cairo \
	hyprlang \
	jq-native \
	libdrm \
	libinput \
	libxkbcommon \
	pango \
	pixman \
	tomlplusplus \
	udis86 \
	virtual/egl \
	wayland \
	wayland-native \
	wlroots \
"

RRECOMMENDS:${PN} ?= " \
	foot \
	jq \
	grim \
	slurp \
	wl-clipboard \
	hyprland-contrib \
"

SRC_URI = " \
	gitsm://github.com/hyprwm/Hyprland.git;protocol=https;branch=main \
	file://meson-build.patch \
"

SRCREV = "1c460e98f870676b15871fe4e5bfeb1a32a3d6d8"
PV = "0.36.0"
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
