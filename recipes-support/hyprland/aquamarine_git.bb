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
SRCREV = "940980244ee505cfa1b2b727c0cf17f97f1426e9"
PV = "0.3.0"

inherit cmake pkgconfig
