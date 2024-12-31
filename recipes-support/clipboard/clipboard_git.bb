SUMMARY = "The Clipboard Project is a fast, lightweight and user friendly tool that lets you do more on the computer in style"
HOMEPAGE = "https://github.com/Slackadays/Clipboard"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += " \
	alsa-lib \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://github.com/Slackadays/Clipboard.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
PV = "0.10.1"
SRCREV = "cf596b0b2403d1d184d509a2c7ddd0f3c11040b9"

inherit cmake pkgconfig

EXTRA_OECMAKE += "-DMSVC=ON -DCMAKE_BUILD_TYPE=Debug"

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = ",-DNO_X11=ON,libx11"

FILES:${PN} += "${libdir}/libcbx11.so ${libdir}/libcbwayland.so ${datadir}/bash-completion"
FILES:${PN}-dev = ""
