SUMMARY = "A shadowplay-like screen recorder for Linux"
HOMEPAGE = "https://git.dec05eba.com/gpu-screen-recorder"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	ffmpeg \
	pipewire \
	pulseaudio \
	libx11 \
	xcomposite \
	libdrm \
	libva \
	libcap \
	dbus \
"

REQUIRED_DISTRO_FEATURES = "wayland x11"

SRC_URI = "git://repo.dec05eba.com/gpu-screen-recorder;protocol=https;branch=master"
SRCREV = "037b215b44f7733fd7c876ffeabbc881831552c9"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

do_install:append() {
	rm ${D}${systemd_user_unitdir}/${PN}.service
}

FILES:${PN} += "${libdir}"
