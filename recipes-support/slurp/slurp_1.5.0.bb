SUMMARY = "Region Selector For Wayland"
DESCRIPTION = "Select a region in a Wayland compositor and print it to the standard output. Works well with grim."
HOMEPAGE = "https://github.com/emersion/slurp"
BUGTRACKER = "https://github.com/emersion/slurp/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e316e9609dd7672b87ff25b46b2cf3e1"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	cairo \
	jpeg \
	libxkbcommon \
	wayland \
	wayland-native \
	wayland-protocols \
           "

SRC_URI = "git://github.com/emersion/slurp.git;protocol=https;branch=master"

SRCREV = "fc921b603ee02afff42aba9eb073e82fab900048"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"


BBCLASSEXTEND = ""

