SUMMARY = "A tiny qt6/qml application to display information about the running system, or copy diagnostics data, without the terminal."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprsysteminfo.git;protocol=https;branch=main"

SRCREV = "17f041e2d539bd63ec116a77236ea37a17c6b3e6"
PV = "0.1.3"

DEPENDS = "qtbase qtquick3d qttools-native hyprutils qtwayland qtwayland-native"
RDEPENDS:${PN} = "hyprland-qt-support"

inherit qt6-cmake
