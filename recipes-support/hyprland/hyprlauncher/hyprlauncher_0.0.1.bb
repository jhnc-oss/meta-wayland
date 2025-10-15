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
	libqalculate \
"

SRC_URI = "git://github.com/hyprwm/hyprlauncher.git;protocol=https;branch=main"

SRCREV = "7b7688ed8072bcd9055abc91193eec3961fe7087"

inherit cmake pkgconfig

RDEPENDS:${PN} = "wl-clipboard"
