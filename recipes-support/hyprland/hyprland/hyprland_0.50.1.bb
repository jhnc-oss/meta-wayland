SUMMARY = "A Wayland WM"
HOMEPAGE = "https://hyprland.org/"
SECTION = "graphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=caa26b106f897db6f8f81cc397942426"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	aquamarine \
	cairo \
	glaze \
	hyprcursor \
	hyprgraphics \
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
	re2 \
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

SRC_URI = "gitsm://github.com/hyprwm/Hyprland.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-meson.build-use-pkgconfig-for-glaze.patch"
SRCREV = "c14f792f8f1e733a0d8310712c7ca7969aa68a67"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd xwayland', d)}"

PACKAGECONFIG[systemd] = "-Dsystemd=enabled,-Dsystemd=disabled"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm xcb-util-renderutil xwayland,xwayland"
PACKAGECONFIG[qt] = ",,hyprland-qtutils,hyprland-qtutils hyprpolkitagent xdg-desktop-portal-hyprland hyprsysteminfo hyprland-welcome hyprland-qt-support kvantum"

do_configure:prepend() {
	cd ${S} && scripts/generateVersion.sh
}

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"

