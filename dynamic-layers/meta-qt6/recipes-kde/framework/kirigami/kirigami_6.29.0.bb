SUMMARY = "QtQuick plugins to build user interfaces following the KDE Human Interface Guidelines"
HOMEPAGE = "https://invent.kde.org/frameworks/kirigami"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND FSFAP AND GPL-2.0-or-later AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/FSFAP.txt;md5=232368338ef6dc99de71c2e05ff12176 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=4dd71a82d66fd9e3ca0cc65b8be370c0 \
"

SRC_URI = "git://invent.kde.org/frameworks/kirigami.git;protocol=https;nobranch=1;tag=v6.29.0"
SRC_URI += "file://0001-fix-metatypes-dir.patch"
SRCREV = "63ad712b696cf35caee33f7612b43ac25452b73e"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtquick3d \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir} ${libdir}/metatypes"

