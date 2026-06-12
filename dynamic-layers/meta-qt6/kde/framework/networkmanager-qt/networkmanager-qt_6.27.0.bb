SUMMARY = "Qt wrapper for NetworkManager DBus API"
HOMEPAGE = "https://invent.kde.org/frameworks/networkmanager-qt"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/networkmanager-qt.git;protocol=https;nobranch=1"
SRCREV = "c959ca5807326622caadfb6516d3ac949ccb050f"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    networkmanager \
"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${libdir}/qml  ${datadir}"
