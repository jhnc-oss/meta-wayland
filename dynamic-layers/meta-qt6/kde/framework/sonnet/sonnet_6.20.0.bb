SUMMARY = "Multi-language spell checker"
HOMEPAGE = "https://invent.kde.org/frameworks/sonnet"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/sonnet.git;protocol=https;nobranch=1"
SRCREV = "dd146797ee0a2b52964f4e0926e597601ec99a08"

DEPENDS = " \
    hunspell \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtquick3d \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${datadir} ${libdir}/plugins ${libdir}/qml"

