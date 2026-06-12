SUMMARY = "Qt wrapper for ModemManager DBus API"
HOMEPAGE = "https://invent.kde.org/frameworks/modemmanager-qt"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/modemmanager-qt.git;protocol=https;nobranch=1"
SRCREV = "d4a1bb89fb5a3f9b25d0e8e417f8b4cf8dafadca"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    modemmanager \
"

inherit qt6-cmake pkgconfig

do_install:append() {
    sed -i 's:${STAGING_INCDIR}:${includedir}:' ${D}${libdir}/cmake/KF6ModemManagerQt/KF6ModemManagerQtTargets.cmake
}

FILES:${PN} += "${libdir}/qml  ${datadir}"
