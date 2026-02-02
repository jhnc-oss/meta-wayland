SUMMARY = "Qt wrapper for ModemManager DBus API"
HOMEPAGE = "https://invent.kde.org/frameworks/modemmanager-qt"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/modemmanager-qt.git;protocol=https;nobranch=1"
SRCREV = "3d1a780733c56e876b30da560351f7ba57f91e98"

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
