SUMMARY = "This houses some qt/qml utilities that might be used by various hypr* apps."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprland-qtutils.git;protocol=https;branch=main"

SRCREV = "a5b4f1e8b34f659a5da992983cc1bd57825f25f7"
S = "${WORKDIR}/git"

DEPENDS = "qtbase qtquick3d qttools-native qtwayland qtwayland-native hyprutils"

inherit qt6-cmake pkgconfig
