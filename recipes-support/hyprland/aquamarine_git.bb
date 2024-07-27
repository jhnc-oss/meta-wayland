SUMMARY = "Aquamarine is a very light linux rendering backend library"
HOMEPAGE = "https:/github.com/hyprwm/aquamarine"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = " \
	hwdata \
	hyprutils \
	hyprwayland-scanner-native \
	libdrm \
	libdisplay-info \
	libinput \
	seatd \
	pixman \
	virtual/libgbm \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://github.com/hyprwm/aquamarine.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "f95d1509370b7f40ef356ff69a332bd0356ab044"
PV = "0.1.0"

inherit cmake pkgconfig
