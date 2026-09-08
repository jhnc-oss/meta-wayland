SUMMARY = "Execute actions as privileged user"
HOMEPAGE = "https://invent.kde.org/frameworks/kholidays"
LICENSE = "BSD-2-Clause AND CC0-1.0 AND GPL-3.0-or-later AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/frameworks/kholidays.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "b69bc2db2116c311514735113a3de12e6504ffc8"

DEPENDS = " \
    bison-native \
    qtbase \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

