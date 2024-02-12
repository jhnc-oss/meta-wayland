SUMMARY = "gamescope: the micro-compositor formerly known as steamcompmgr"
HOMEPAGE = "https://github.com/ValveSoftware/gamescope"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a0fe8e93fee55f3a3a8cc0681c48448a"

REQUIRED_DISTRO_FEATURES = "x11 wayland"

DEPENDS += " \
	aom \
	glm \
	glslang-native \
	hwdata \
	libavif \
	libcap \
	libdisplay-info \
	libliftoff \
	libsdl2 \
	libx11\
	libxcomposite \
	libxcursor \
	libxkbcommon \
	libxres \
	libxmu \
	libxrender \
	libxtst \
	stb \
	vulkan-headers \
	wayland \
	wayland-native \
	wayland-protocols \
	wlroots-0.17 \
"

RDEPENDS:${PN} = "xwayland"

CXXFLAGS:append = " -I${STAGING_INCDIR}/stb"

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'opengl pipewire', d)}"
PACKAGECONFIG[openvr] = "-Denable_openvr_support=true,-Denable_openvr_support=false,openvr"
PACKAGECONFIG[pipewire] = "-Dpipewire=enabled,-Dpipewire=disabled,pipewire"
PACKAGECONFIG[opengl] = ",,mesa-glut"


SRC_URI = "   \
	gitsm://github.com/ValveSoftware/gamescope.git;branch=master;protocol=https \
	file://0001-meson.build-dont-fail-if-stb-is-not-found.patch \
	file://0001-meson.build-dont-leak-buildpath.patch \
"
SRCREV = "bca7990e61a1eb8198e54d86a4a9a44d41d9b07e"
PV = "3.14.0"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir} ${libdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"
