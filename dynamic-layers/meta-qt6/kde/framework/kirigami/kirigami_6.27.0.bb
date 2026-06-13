SUMMARY = "QtQuick plugins to build user interfaces following the KDE Human Interface Guidelines"
HOMEPAGE = "https://invent.kde.org/frameworks/kirigami"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90"

SRC_URI = "git://invent.kde.org/frameworks/kirigami.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-fix-metatypes-dir.patch"
SRCREV = "4d7a97d502519ab34344a15b443dd400ed231640"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtquick3d \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir} ${libdir}/metatypes"

