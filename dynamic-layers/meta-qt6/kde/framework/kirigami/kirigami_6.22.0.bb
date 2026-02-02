SUMMARY = "QtQuick plugins to build user interfaces following the KDE Human Interface Guidelines"
HOMEPAGE = "https://invent.kde.org/frameworks/kirigami"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90"

SRC_URI = "git://invent.kde.org/frameworks/kirigami.git;protocol=https;nobranch=1"
SRCREV = "a5fbb933b96333dcfe9bfcc2deea3fd5b0396c8b"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}"

