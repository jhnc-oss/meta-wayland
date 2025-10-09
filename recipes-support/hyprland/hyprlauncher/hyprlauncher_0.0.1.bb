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
	icu \
	hyprlang \
"

SRC_URI = "git://github.com/hyprwm/hyprlauncher.git;protocol=https;branch=main"

SRCREV = "43d2b694186fe5bb0547a81a7f7a2ca3f9cbac24"

inherit cmake pkgconfig

RDEPENDS:${PN} = "wl-clipboard"
