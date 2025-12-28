SUMMARY = "QML greetd dm based on qt-session-lock and greetd"
HOMEPAGE = "https://github.com/waycrate/greetd-waycratedm"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM += "file://LICENSE;md5=33ecba7309ee0bbf1c82fbcd47ba0e8c"

SRC_URI = "git://github.com/waycrate/greetd-waycratedm.git;protocol=https;nobranch=1"
SRCREV = "eb245374f1e8b9207bae7dfd76e39d830b012ff6"

DEPENDS = "qttools qttools-native greetd qt-session-lock tomlplusplus"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${libdir}/sysusers.d ${libdir}/tmpfiles.d"
