SUMMARY = "A Wayland WM"
HOMEPAGE = "https://hyprland.org/"
SECTION = "graphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=caa26b106f897db6f8f81cc397942426"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
    aquamarine \
    cairo \
    glaze6 \
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
SRCREV = "dd220efe7b1e292415bd0ea7161f63df9c95bfd3"

inherit cmake pkgconfig features_check

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release"

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd x11', d)}"

PACKAGECONFIG[tests] = "-DBUILD_TESTING=ON -DBUILD_HYPRTESTER=ON,-DBUILD_TESTING=OFF -DBUILD_HYPRTESTER=OFF"
PACKAGECONFIG[systemd] = "-DSYSTEMD=ON,-DNO_SYSTEMD=ON"
PACKAGECONFIG[x11] = "-DXWAYLAND=ON,-DNO_XWAYLAND=ON,libxcb xcb-util-wm xcb-util-renderutil xcb-util-errors xwayland,xwayland"
PACKAGECONFIG[qt] = ",,,hyprpolkitagent xdg-desktop-portal-hyprland hyprsysteminfo hyprland-qt-support qt6ct"

FILES:${PN} += "${datadir} ${systemd_user_unitdir} ${libdir}/hyprtestplugin.so"
