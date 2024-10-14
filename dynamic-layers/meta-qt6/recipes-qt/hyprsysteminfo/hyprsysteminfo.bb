SUMMARY = "A tiny qt6/qml application to display information about the running system, or copy diagnostics data, without the terminal."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprsysteminfo.git;protocol=https;branch=main"

SRCREV = "9b50bb2c297ac65d280ddc49803de71c93932e31"
S = "${WORKDIR}/git"

DEPENDS = "qtbase qtquick3d qttools-native hyprutils"

inherit qt6-cmake
