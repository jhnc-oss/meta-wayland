SUMMARY = "A tiny qt6/qml application to display information about the running system, or copy diagnostics data, without the terminal."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprsysteminfo.git;protocol=https;branch=main"

SRCREV = "3498fad4c4b9c161fd78896ef583f492c93c7859"
S = "${WORKDIR}/git"
PV = "0.1.2"

DEPENDS = "qtbase qtquick3d qttools-native hyprutils qtwayland qtwayland-native"

inherit qt6-cmake
