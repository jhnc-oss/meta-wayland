SUMMARY = "Multi-language spell checker"
HOMEPAGE = "https://invent.kde.org/frameworks/sonnet"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.0-or-later AND LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

SRC_URI = "git://invent.kde.org/frameworks/sonnet.git;protocol=https;nobranch=1"
SRCREV = "6a2c185fc05dcfca3f97dd239b6336b2d8940aaf"

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

