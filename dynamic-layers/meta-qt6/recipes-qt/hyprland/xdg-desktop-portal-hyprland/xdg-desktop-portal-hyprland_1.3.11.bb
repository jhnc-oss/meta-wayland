SUMMARY = "This provides screenshot/screencast xdg-desktop-portal backends for hyprland."
HOMEPAGE = "https://github.com/hyprwm/xdg-desktop-portal-hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0f1d50df739a9fb8eae12a8f37ce352"

SRC_URI = "gitsm://github.com/hyprwm/xdg-desktop-portal-hyprland.git;protocol=https;nobranch=1"
SRCREV = "4b8801228ff958d028f588f0c2b911dbf32297f9"

DEPENDS = " \
    hyprlang \
    hyprutils \
    hyprwayland-scanner-native \
    hyprwayland-scanner \
    libdrm \
    pipewire \
    qtbase \
    sdbus-c++ \
    virtual/libgbm \
    wayland \
    wayland-protocols \
"

RDEPENDS:${PN} = "grim slurp hyprlang"
RCONFLICTS:${PN} = "xdg-desktop-portal-wlr xdg-desktop-portal-gnome"

inherit qt6-cmake pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "opengl wayland"

PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)}"
PACKAGECONFIG[systemd] = "-DSYSTEMD_SERVICES=ON,-DSYSTEMD_SERVICES=OFF"

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"
