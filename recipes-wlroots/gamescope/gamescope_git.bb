SUMMARY = "gamescope: the micro-compositor formerly known as steamcompmgr"
HOMEPAGE = "https://github.com/ValveSoftware/gamescope"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a0fe8e93fee55f3a3a8cc0681c48448a"

REQUIRED_DISTRO_FEATURES = "x11 wayland"

DEPENDS += " \
	glm \
	glslang-native \
	hwdata \
	pipewire \
	libavif \
	libcap \
	libdisplay-info \
	libliftoff \
	libsdl2 \
	stb \
	libx11\
	libxcomposite \
	libxcursor \
	libxkbcommon \
	libxres \
	libxmu \
	vulkan-headers \
	vulkan-loader \
	wayland \
	wayland-native \
	wayland-protocols \
	wlroots-0.17 \
"

CXXFLAGS:append = " -I${STAGING_INCDIR}/stb"

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'pipewire', d)}"
PACKAGECONFIG[openvr] = "-Denable_openvr_support=true,-Denable_openvr_support=false,openvr"
PACKAGECONFIG[pipewire] = "-Dpipewire=enabled,-Dpipwire=disabled,pipewire"

SRC_URI = "   \
	gitsm://github.com/ValveSoftware/gamescope.git;branch=master;protocol=https \
	file://0001-meson.build-dont-fail-if-stb-is-not-found.patch \
"
SRCREV = "3e14ef9c37266b19ba77fbef467d1b8a77d827f2"
PV = "3.13.19"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir} ${libdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"
