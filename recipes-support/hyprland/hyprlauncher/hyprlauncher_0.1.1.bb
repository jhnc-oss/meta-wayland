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

SRC_URI = "git://github.com/hyprwm/hyprlauncher.git;protocol=https;branch=main"

SRCREV = "87cb5587bd2113721c4116bc5aa129d0e200a8fb"

inherit cmake pkgconfig

RDEPENDS:${PN} = "wl-clipboard"
