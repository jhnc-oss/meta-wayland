SUMMARY = "GTK-based lockscreen for Wayland."
HOMEPAGE = "https://github.com/jovanlanik/gtklock"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

REQUIRED_DISTRO_FEATURES = "wayland pam"

DEPENDS = " \
	glib-2.0-native \
	gtk+3 \
	gtk-session-lock \
	libpam \
	scdoc-native \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://github.com/jovanlanik/gtklock.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "4.0.0"
SRCREV = "66321fb2bf0d5869d779e7ac6b4d8d9c272ea707"

inherit meson pkgconfig features_check

