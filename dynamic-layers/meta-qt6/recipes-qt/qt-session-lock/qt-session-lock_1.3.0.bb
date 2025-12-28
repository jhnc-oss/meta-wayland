SUMMARY = "This lib is the binding of ext-session-lock for qt"
HOMEPAGE = "https://github.com/waycrate/qt-session-lock"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM += "file://LICENSE;md5=33ecba7309ee0bbf1c82fbcd47ba0e8c"

SRC_URI = "git://github.com/waycrate/qt-session-lock.git;protocol=https;nobranch=1"
SRCREV = "430e33237fbdd1724d110e8abe08d3131181a29d"

DEPENDS = "qttools qtbase-native qttools-native wayland wayland-native libxkbcommon"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${libdir}/qt6/plugins/wayland-shell-integration"
