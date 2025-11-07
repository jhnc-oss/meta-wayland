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
	libxkbcommon \
	pango \
	pixman \
	re2 \
	tomlplusplus \
	util-linux-libuuid \
	virtual/egl \
	wayland-native \
	hyprwayland-scanner-native \
"

RRECOMMENDS:${PN} ?= " \
	foot \
	jq \
	grim \
	hyprland-guiutils \
	slurp \
	wl-clipboard \
	hyprland-contrib \
"

SRC_URI = "gitsm://github.com/hyprwm/Hyprland.git;protocol=https;nobranch=1"
SRCREV = "f56ec180d3a03a5aa978391249ff8f40f949fb73"

inherit cmake pkgconfig features_check

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release"
 
PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd xwayland', d)}"

PACKAGECONFIG[tests] = "-DBUILD_TESTING=ON -DBUILD_HYPRTESTER=ON,-DBUILD_TESTING=OFF -DBUILD_HYPRTESTER=OFF"
PACKAGECONFIG[systemd] = "-DSYSTEMD=ON,-DNO_SYSTEMD=ON"
PACKAGECONFIG[xwayland] = "-DXWAYLAND=ON,-DNO_XWAYLAND=ON,libxcb xcb-util-wm xcb-util-renderutil xcb-util-errors xwayland,xwayland"
PACKAGECONFIG[qt] = ",,,hyprpolkitagent xdg-desktop-portal-hyprland hyprsysteminfo hyprland-welcome hyprland-qt-support qt6ct"

FILES:${PN} += "${datadir} ${systemd_user_unitdir} ${libdir}/hyprtestplugin.so"
