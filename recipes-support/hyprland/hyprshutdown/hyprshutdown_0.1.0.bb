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

SRCREV = "9f18be9c4e1a484c65b22dd53280815dc79a5a56"

inherit cmake pkgconfig
