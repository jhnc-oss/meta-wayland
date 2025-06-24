SUMMARY = "This is a library to use GTK 3 to build screen lockers using the secure ext-session-lock-v1 protocol"
HOMEPAGE = "https://github.com/Cu3PO42/gtk-session-lock"
LICENSE = "GPL-3.0-only & MIT"

LIC_FILES_CHKSUM = "file://LICENSE_GPL.txt;md5=1ebbd3e34237af26da5dc08a4e440464"
LIC_FILES_CHKSUM += "file://LICENSE_MIT.txt;md5=ffeb3391e5dace600b84c757688b9f1b"

REQUIRED_DISTRO_FEATURES = "wayland gobject-introspection"

DEPENDS = " \
	glib-2.0-native \
	gtk+3 \
	scdoc-native \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://github.com/Cu3PO42/gtk-session-lock.git;protocol=https;branch=master"

SRCREV = "b3544f361498d716b1ceef1ad6ac9bdf024bf782"

inherit meson pkgconfig features_check gobject-introspection vala

