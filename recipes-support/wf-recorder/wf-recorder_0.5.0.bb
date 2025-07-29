SUMMARY = "A Wayland Screen Recorder"
HOMEPAGE = "https://github.com/ammen99/wf-recorder"
BUGTRACKER = "https://github.com/ammen99/wf-recorder/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=dd7ed145448eb375bc1d98e5169ae84e"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	ffmpeg \
	pulseaudio \
	pipewire \
"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://github.com/ammen99/wf-recorder.git;protocol=https;branch=master \
"
SRCREV = "664fc451caa7559a39c2cdd70ff02ea781e2d4b3"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}/fish"

