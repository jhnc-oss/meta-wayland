SUMMARY = "An alternative to xdg-desktop-portal-wlr for wlroots compositors"
HOMEPAGE = "https://github.com/waycrate/xdg-desktop-portal-luminous"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33ecba7309ee0bbf1c82fbcd47ba0e8c"

SRC_URI = "git://github.com/waycrate/xdg-desktop-portal-luminous.git;protocol=https;nobranch=1"
SRCREV = "62619628dc11e43989a2d37476f07ea836298253"

DEPENDS = "wayshot pipewire clang-native"

require xdg-desktop-portal-luminous-crates.inc

inherit cargo pkgconfig cargo-update-recipe-crates

do_compile:prepend() {
	export LIBCLANG_PATH="${STAGING_LIBDIR_NATIVE}/libclang.so"
}

RCONFLICTS:${PN} = "xdg-desktop-portal-wlr"
