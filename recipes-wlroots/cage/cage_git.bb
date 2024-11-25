SUMMARY = "Cage: a Wayland kiosk"
HOMEPAGE = "https://www.hjdskes.nl/projects/cage/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3d06ce025701c9a0b391f15902ce8ed"

DEPENDS = " \
    wayland-native \
    wayland \
    wayland-protocols \
    wlroots-0.17 \
    pixman \
    libxkbcommon \
"

inherit meson pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "git://github.com/cage-kiosk/cage;branch=master;protocol=https"
SRCREV = "9d43282fa0cd5925a6f9304f0218fd79ae9fcd94"
PV = "0.1.5+dev"
S = "${WORKDIR}/git"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'xwayland', d)}"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xserver-xorg,xwayland"
