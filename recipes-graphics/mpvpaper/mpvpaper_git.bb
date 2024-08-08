SUMMARY = "MPVPaper allows you to play videos with mpv as your wallpaper."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/GhostNaN/mpvpaper.git;protocol=https;branch=master"

DEPENDS = " \
	mpv \
	virtual/egl \
	wayland \
	wayland-native \
	wayland-protocols \
"

S = "${WORKDIR}/git"
SRCREV = "0069bc236e47f35605c5326a81c3a163fb0c988e"
PV = "1.7"

inherit meson pkgconfig

EXTRA_OEMESON += "--buildtype release"
