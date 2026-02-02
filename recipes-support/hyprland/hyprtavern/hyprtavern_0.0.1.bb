SUMMARY = "A modern, simple and consistent session bus for IPC discovery"
HOMEPAGE = "https:/github.com/hyprwm/hyptavern"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = " \
	glaze6 \
	hyprtoolkit \
	pixman \
	libdrm \
	hyprutils \
	hyprwire \
	hyprwire-native \
	hyprwire-protocols \
	hyprlang \
	fontconfig \
	libqalculate \
"

SRC_URI = "git://github.com/hyprwm/hyprtavern.git;protocol=https;branch=main"

SRCREV = "946aa84275af9c97773935b94c1f9cbd4dc3286b"

inherit cmake pkgconfig

RDEPENDS:${PN} += "icu"
