SUMMARY = "Image Grabber For Wayland"
DESCRIPTION = "Grab images from a Wayland compositor. Works great with slurp and with sway"
HOMEPAGE = "https://github.com/emersion/grim"
BUGTRACKER = "https://github.com/emersion/grim/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e316e9609dd7672b87ff25b46b2cf3e1"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	pixman \
	libpng \
	jpeg \	
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://gitlab.freedesktop.org/emersion/grim;protocol=https;branch=master"

SRCREV = "b7a99854e46945db9f50ba8d2417ac42321173d1"

inherit meson pkgconfig features_check

EXTRA_OEMESON = "--buildtype release"

BBCLASSEXTEND = ""

