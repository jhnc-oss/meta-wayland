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
SRCREV = "5cfca204b6737e9c82e7430e1b59337eb4467c52"


inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"
GIR_EXTRA_LIBS_PATH = "${WORKDIR}"

FILES:${PN} += "${prefix}"

BBCLASSEXTEND = ""

