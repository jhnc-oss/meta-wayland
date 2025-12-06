SUMMARY = "A graceful shutdown/logout utility for Hyprland"
HOMEPAGE = "https:/github.com/hyprwm/hyprshutdown"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = " \
	glaze \
	hyprtoolkit \
	hyprutils \
	pixman \
	libdrm \
 "

SRC_URI = "git://github.com/hyprwm/hyprshutdown.git;protocol=https;branch=main"

SRCREV = "e013cf2130be8969eb407fd054163d87867f5d07"

inherit cmake pkgconfig
