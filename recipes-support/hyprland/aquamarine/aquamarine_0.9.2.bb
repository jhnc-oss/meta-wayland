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
	virtual/libgl \
	virtual/egl \
	virtual/libgbm \
	virtual/libgles3 \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://github.com/hyprwm/aquamarine.git;protocol=https;branch=main"
SRC_URI += "file://0001-CMakeLists.txt-fix-linking-with-opengl.patch"

SRCREV = "e31b575d19e7cf8a8f4398e2f9cffe27a1332506"

inherit cmake pkgconfig
