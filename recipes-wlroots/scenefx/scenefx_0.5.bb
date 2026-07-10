SUMMARY = "wlroots scene api replacement"
HOMEPAGE = "https://github.com/wlrfx/scenefx"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7578fad101710ea2d289ff5411f1b818"

SRC_URI = "git://github.com/wlrfx/scenefx.git;protocol=https;nobranch=1"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	libdrm \
	libxkbcommon \
	pixman \
	wlroots-0.20 \
"

inherit meson pkgconfig

SRCREV = "37ccd723bef49e6891156ffafce8f549f01446cc"

FILES:${PN} += "${libdir}/libscenefx-0.5.so"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"
