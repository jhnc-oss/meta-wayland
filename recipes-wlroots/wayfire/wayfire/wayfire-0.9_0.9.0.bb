SUMMARY = "A Wayland WM"
HOMEPAGE = "https://github.com/WayfireWM/wayfire"
BUGTRACKER = "https://github.com/WayfireWM/wayfire/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=14e4594093363e3c3a530e9b54cb5285"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	cairo \
	freetype \
	glm \
	hwdata-native \
	jpeg \
	libdrm \
	libevdev \
	libinput \
	libpng \
	libxkbcommon \
	libxml2 \
	nlohmann-json \
	pango \
	pixman \
	seatd \
	virtual/libgl \
	wayland \
	wayland-native \
	wayland-protocols \
"

RRECOMMENDS:${PN} += " \
	wcm-0.9 \
	wf-recorder \
	wf-shell-0.9 \
	pywayfire \
"

PACKAGECONFIG[gles32] = "-Denable_gles32=true,-Denable_gles32=false"
PACKAGECONFIG[use_system_wfconfig] = "-Duse_system_wfconfig=enabled,-Duse_system_wfconfig=disabled,wf-config-0.9"
PACKAGECONFIG[use_system_wlroots] = "-Duse_system_wlroots=enabled,-Duse_system_wlroots=disabled,wlroots-0.18"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland xcb-util-renderutil xcb-util-wm"
PACKAGECONFIG[vulkan] = ",,vulkan-loader vulkan-headers glslang-native"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'vulkan xwayland', d)} \
	gles32 \
	use_system_wlroots \
	use_system_wfconfig \
"

SRC_URI = "gitsm://github.com/WayfireWM/wayfire.git;protocol=https;nobranch=1"

SRCREV = "fdadd85665e3ec734d058c983495b2819da631c8"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

do_install:append() {
	rm -rf ${D}${prefix}/man
}

FILES:${PN} += "${datadir} ${libdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig ${libdir}/libwlroots.so ${libdir}/libwf-utils.so ${libdir}/libwf-config.so"

