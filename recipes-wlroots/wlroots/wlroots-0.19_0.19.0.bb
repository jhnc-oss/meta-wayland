SUMMARY = "A modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable, unopinionated modules for building a \
Wayland compositor; or about 50,000 lines of code you were \
going to write anyway."
HOMEPAGE = "https://gitlab.freedesktop.org/wlroots"
BUGTRACKER = "https://gitlab.freedesktop.org/wlroots/wlroots/-/issues"
SECTION = "graphics"
LICENSE = "MIT & CC0-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89e064f90bcb87796ca335cbd2ce4179"
LIC_FILES_CHKSUM += "file://tinywl/LICENSE;md5=d957da0415f5b0b974bfc6063afab2b5"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	hwdata-native \
	libdisplay-info \
	libdrm \
	libxkbcommon \
	pixman \
	seatd \
	wayland \
	wayland-native \
	wayland-protocols \
"

PACKAGECONFIG[opengl] = ",,virtual/egl virtual/libgles2"
PACKAGECONFIG[gbm] = ",,virtual/libgbm"
PACKAGECONFIG[libinput] = ",,libinput"
PACKAGECONFIG[libliftoff] = "-Dlibliftoff=enabled,-Dlibliftoff=disabled,libliftoff"
PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,eudev elogind"
PACKAGECONFIG[vulkan] = ",,vulkan-loader vulkan-headers glslang-native"
PACKAGECONFIG[x11] = ",,xcb-util-renderutil"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland xcb-util-wm,xwayland"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd vulkan x11 xwayland opengl', d)} \
	libinput \
	libliftoff \
"

SRC_URI = "git://gitlab.freedesktop.org/wlroots/wlroots.git;branch=0.19;protocol=https"
SRCREV = "13a62a23a258d96f902c740310d5c7c59784a4d1"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

do_install:append() {
	install -d ${D}${bindir}
	install -m 0755 ${B}/tinywl/tinywl ${D}${bindir}
}

FILES:${PN} += "${libdir}/libwlroots-*.so"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"
