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
SRCREV = "9978c3570436eb5358e4578421d83a7f3ffd2683"

S = "${WORKDIR}/git"
PV = "0.4.1"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"
GIR_EXTRA_LIBS_PATH="${WORKDIR}"

FILES:${PN} += "${prefix}"

BBCLASSEXTEND = ""

