SUMMARY = "Hyprland GUI utils"
HOMEPAGE = "https:/github.com/hyprwm/hypland-guiutils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = "pixman libdrm hyprlang hyprutils hyprtoolkit hyprwayland-scanner-native"

SRC_URI = "git://github.com/hyprwm/hyprland-guiutils.git;protocol=https;branch=main"

SRCREV = "a16ad89ed5fb4192c966018a80c652de8d96f748"

inherit cmake pkgconfig
