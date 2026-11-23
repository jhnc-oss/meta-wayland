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

SRC_URI = "git://github.com/jovanlanik/gtklock.git;protocol=https;branch=master;tag=v${PV}"

SRCREV = "4f7520abdf7f2fe04adba2d80c4ab228b009adfa"

inherit meson pkgconfig features_check

