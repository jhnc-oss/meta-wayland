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
SRCREV = "8678234c163d0b0b616ec9ff6e5e0e1c87e0e6f4"
PV = "1.4"

inherit meson pkgconfig

EXTRA_OEMESON += "--buildtype release"
