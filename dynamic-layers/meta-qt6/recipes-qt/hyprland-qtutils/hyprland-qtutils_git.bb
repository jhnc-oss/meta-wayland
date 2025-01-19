SUMMARY = "This repo houses some qt/qml utilities that might be used by various hypr* apps"
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprland-qtutils.git;protocol=https;branch=main"

SRCREV = "534cd1badc46ec9bdd986ab41ad2408bf845961e"
S = "${WORKDIR}/git"
PV = "0.1.3"

DEPENDS = "qtbase qtquick3d qttools-native qtwayland qtwayland-native hyprutils"

inherit qt6-cmake pkgconfig
