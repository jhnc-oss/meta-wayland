SUMMARY = "A multipurpose and versatile launcher / picker for Hyprland"
HOMEPAGE = "https:/github.com/hyprwm/hyprlauncher"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = "  \
	hyprtoolkit  \
	pixman \
	libdrm \
	hyprutils \
	hyprwire \
	hyprwire-native \
	icu \
	hyprlang \
	libqalculate \
"

SRC_URI = "git://github.com/hyprwm/hyprlauncher.git;protocol=https;branch=main;tag=v${PV}"

SRCREV = "d08efd580c782fbf52ec299f77cd6c0fef7ee3d5"

inherit cmake pkgconfig

RDEPENDS:${PN} = "wl-clipboard"
