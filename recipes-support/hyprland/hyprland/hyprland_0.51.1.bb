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
	slurp \
	wl-clipboard \
	hyprland-contrib \
"

SRC_URI = "gitsm://github.com/hyprwm/Hyprland.git;protocol=https;nobranch=1"
SRCREV = "71a1216abcc7031776630a6d88f105605c4dc1c9"

inherit cmake pkgconfig features_check

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release"
 
PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd xwayland', d)}"

PACKAGECONFIG[tests] = "-DTESTS=ON,-DNO_TESTS=ON"
PACKAGECONFIG[systemd] = "-DSYSTEMD=ON,-DNO_SYSTEMD=ON"
PACKAGECONFIG[xwayland] = "-DXWAYLAND=ON,-DNO_XWAYLAND=ON,libxcb xcb-util-wm xcb-util-renderutil xcb-util-errors xwayland,xwayland"
PACKAGECONFIG[qt] = ",,hyprland-qtutils,hyprland-qtutils hyprpolkitagent xdg-desktop-portal-hyprland hyprsysteminfo hyprland-welcome hyprland-qt-support qt6ct"

B = "${S}"

do_configure:prepend() {
	cd ${S} && scripts/generateVersion.sh
}


FILES:${PN} += "${datadir} ${systemd_user_unitdir} ${libdir}/hyprtestplugin.so"
