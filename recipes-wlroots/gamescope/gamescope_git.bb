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
	libdisplay-info \
	libinput \
	libliftoff \
	libsdl2 \
	libdrm \
	libx11\
	libxcomposite \
	libxcursor \
	libxkbcommon \
	libxres \
	libxmu \
	libxrender \
	libxtst \
	seatd \
	stb \
	vulkan-headers \
	wayland \
	wayland-native \
	wayland-protocols \
	xcb-util-wm \
	xwayland \
"

RDEPENDS:${PN} = "xwayland hwdata"

CXXFLAGS:append = " -I${STAGING_INCDIR}/stb"

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'opengl pipewire', d)} openvr"
PACKAGECONFIG[openvr] = "-Denable_openvr_support=true,-Denable_openvr_support=false"
PACKAGECONFIG[pipewire] = "-Dpipewire=enabled,-Dpipewire=disabled,pipewire"
PACKAGECONFIG[opengl] = ",,mesa-glut"


SRC_URI = " \
	gitsm://github.com/ValveSoftware/gamescope.git;branch=jupiter-3.5;protocol=https \
	file://0001-meson.build-dont-leak-buildpath.patch \
	file://0001-meson.build-dont-fail-if-stb-is-not-found.patch \
"

SRCREV = "c59b09dbc0c100f604ae603c5f0026c42c62d49c"
PV = "3.13.16.9"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir} ${libdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"
