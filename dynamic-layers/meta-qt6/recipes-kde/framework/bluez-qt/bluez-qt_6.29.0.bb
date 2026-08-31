SUMMARY = "Qt wrapper for BlueZ 5 DBus API"
HOMEPAGE = "https://invent.kde.org/frameworks/bluez-qt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/bluez-qt.git;protocol=https;nobranch=1"
SRCREV = "80ef0b31e920e61d501f9d438ad35d48a0975f51"

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

