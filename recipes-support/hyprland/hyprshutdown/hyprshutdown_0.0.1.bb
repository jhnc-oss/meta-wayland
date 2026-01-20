SUMMARY = "A graceful shutdown/logout utility for Hyprland"
HOMEPAGE = "https:/github.com/hyprwm/hyprshutdown"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = " \
	glaze6 \
	hyprtoolkit \
	hyprutils \
	pixman \
	libdrm \
 "

SRC_URI = "git://github.com/hyprwm/hyprshutdown.git;protocol=https;branch=main"

SRCREV = "89e23430308553db4decc34aaa3a9de42cbb33cb"

inherit cmake pkgconfig
