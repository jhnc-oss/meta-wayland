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

SRC_URI = "git://github.com/hyprwm/hyprshutdown.git;protocol=https;branch=main;tag=v${PV}"
SRCREV = "932dcf06320da94e5f7fa73cf449e8b8c394bf9d"

inherit cmake pkgconfig
