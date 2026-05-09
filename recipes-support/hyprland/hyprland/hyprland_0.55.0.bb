SUMMARY = "A Wayland WM"
HOMEPAGE = "https://hyprland.org/"
SECTION = "graphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=83fb0c6a837b7f0de6df847876e6295d"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
    aquamarine \
    cairo \
    glaze \
    glslang \
    hyprcursor \
    hyprgraphics \
    hyprlang \
    hyprutils \
    hyprwayland-scanner-native \
    hyprwire \
    hyprwire-native \
    jq-native \
    libdrm \
    libinput \
    libxcursor \
    libxkbcommon \
    lua \
    muparser \
    pango \
    pixman \
    re2 \
    tomlplusplus \
    util-linux-libuuid \
    virtual/egl \
    virtual/libgles3 \
    wayland-native \
"

RRECOMMENDS:${PN} ?= " \
	foot \
	grim \
	hyprland-contrib \
	hyprland-guiutils \
	hyprshutdown \
	jq \
	slurp \
	wl-clipboard \
"

SRC_URI = "gitsm://github.com/hyprwm/Hyprland.git;protocol=https;nobranch=1"
SRCREV = "af923e30d1d24f1f4a4f5cb8308065173c1d9539"

inherit cmake pkgconfig features_check

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release"

do_configure:prepend() {
	touch ${STAGING_BINDIR}/glslang
}

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd x11', d)} uwsm"

PACKAGECONFIG[tests] = "-DBUILD_TESTING=ON -DBUILD_HYPRTESTER=ON,-DBUILD_TESTING=OFF -DBUILD_HYPRTESTER=OFF"
PACKAGECONFIG[systemd] = "-DSYSTEMD=ON,-DNO_SYSTEMD=ON"
PACKAGECONFIG[x11] = "-DXWAYLAND=ON,-DNO_XWAYLAND=ON,libxcb xcb-util-wm xcb-util-renderutil xcb-util-errors xwayland,xwayland"
PACKAGECONFIG[qt] = ",,,hyprpolkitagent xdg-desktop-portal-hyprland hyprsysteminfo hyprland-qt-support qt6ct"
PACKAGECONFIG[uwsm] = "-DUWSM=ON,-DNO_UWSM=ON,,uwsm"
PACKAGECONFIG[hyprpm] = "-DHYPRPM=ON,-DNO_HYPRPM=ON"

FILES:${PN} += "${datadir} ${systemd_user_unitdir} ${libdir}/hyprtestplugin.so"
