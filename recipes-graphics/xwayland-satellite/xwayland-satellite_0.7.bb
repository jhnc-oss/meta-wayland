SUMMARY = "xwayland-satellite grants rootless Xwayland integration to any Wayland compositor implementing xdg_wm_base and viewporter"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

SRC_URI = "git://github.com/Supreeeme/xwayland-satellite.git;protocol=https;branch=main"

DEPENDS = " \
    xwayland \
    libxcb \
    xcb-util-cursor \
    clang-native \
"

SRCREV = "388d291e82ffbc73be18169d39470f340707edaa"

inherit cargo cargo-update-recipe-crates pkgconfig

require ${PN}-crates.inc

export LIBCLANG_PATH = "${STAGING_LIBDIR_NATIVE}/libclang.so"
