SUMMARY = "A tiny qt6/qml application to display information about the running system, or copy diagnostics data, without the terminal."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprsysteminfo.git;protocol=https;branch=main"

SRCREV = "8b271e2ba39a5a9299e4e7bb60245a71704f5a89"
S = "${WORKDIR}/git"
PV = "0.1.1"

DEPENDS = "qtbase qtquick3d qttools-native hyprutils qtwayland qtwayland-native"

inherit qt6-cmake
