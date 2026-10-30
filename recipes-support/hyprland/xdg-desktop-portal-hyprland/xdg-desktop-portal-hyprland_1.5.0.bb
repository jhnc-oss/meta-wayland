SUMMARY = "This provides screenshot/screencast xdg-desktop-portal backends for hyprland."
HOMEPAGE = "https://github.com/hyprwm/xdg-desktop-portal-hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0f1d50df739a9fb8eae12a8f37ce352"

SRC_URI = "gitsm://github.com/hyprwm/xdg-desktop-portal-hyprland.git;protocol=https;nobranch=1;tag=v${PV}"
SRCREV = "d1467fea8d1895cb7835829c2fbb271a0d37760a"

DEPENDS = " \
    hyprlang \
    hyprtoolkit \
    hyprutils \
    hyprwayland-scanner-native \
    hyprwayland-scanner \
    libdrm \
    pipewire \
    sdbus-c++ \
    util-linux-libuuid \
    virtual/libgbm \
    wayland \
    wayland-protocols \
"

RDEPENDS:${PN} = "grim slurp hyprlang"

inherit cmake pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "opengl wayland"

PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)}"
PACKAGECONFIG[systemd] = "-DSYSTEMD_SERVICES=ON,-DSYSTEMD_SERVICES=OFF"

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"
