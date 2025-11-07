SUMMARY = "Hyprland GUI utils"
HOMEPAGE = "https:/github.com/hyprwm/hypland-guiutils"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

DEPENDS = "pixman libdrm hyprlang hyprutils hyprtoolkit"

SRC_URI = "git://github.com/hyprwm/hyprland-guiutils.git;protocol=https;branch=main"

SRCREV = "a415eba866a953f3096d661318f771aa0082eb98"

inherit cmake pkgconfig
