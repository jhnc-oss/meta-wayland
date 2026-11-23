SUMMARY = "A fullscreen overlay UI for GPU Screen Recorder in the style of ShadowPlay"
HOMEPAGE = "https://git.dec05eba.com/gpu-screen-recorder-ui"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = " \
	dbus \
	xext \
	libx11 \
	libxi \
	pango \
	xrandr \
	libxcursor \
	xcomposite \
	pulseaudio \
	libdrm \
	wayland \
	wayland-native \
	desktop-file-utils-native \
"

REQUIRED_DISTRO_FEATURES = "wayland x11"

SRC_URI = "gitsm://repo.dec05eba.com/gpu-screen-recorder-ui;protocol=https;branch=master"
SRCREV = "b8f72e41aa8f113fc97804a3b10a860cd26c0dab"

inherit meson pkgconfig features_check mime mime-xdg

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} = "gpu-screen-recorder"
