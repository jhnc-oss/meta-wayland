SUMMARY = "Qt wrapper for BlueZ 5 DBus API"
HOMEPAGE = "https://invent.kde.org/frameworks/bluez-qt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/bluez-qt.git;protocol=https;nobranch=1"
SRCREV = "b6426b8ff8cb24229fd5cb2331b4338dc7a563a2"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    bluez5 \
"

inherit qt6-cmake

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

