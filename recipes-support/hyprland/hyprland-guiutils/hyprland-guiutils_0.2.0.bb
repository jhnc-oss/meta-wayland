SUMMARY = "Hyprland GUI utils"
HOMEPAGE = "https:/github.com/hyprwm/hypland-guiutils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = "pixman libdrm hyprlang hyprutils hyprtoolkit hyprwayland-scanner-native"

SRC_URI = "git://github.com/hyprwm/hyprland-guiutils.git;protocol=https;branch=main"

SRCREV = "e50ae912813bdfa8372d62daf454f48d6df02297"

inherit cmake pkgconfig
