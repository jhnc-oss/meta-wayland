SUMMARY = "Shared widgets and classes for PIM applications"
HOMEPAGE = "https://invent.kde.org/pim/libkdepim"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=261bea1168c0bdfa73232ee90df11eb6 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LicenseRef-Qt-Commercial-exception-1.0.txt;md5=d9d0aeb114751f2eea6f9e841228004a \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/pim/libkdepim.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "29e43a6ef94726c39d2b3957c1d4f3bf5bea0954"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcompletion \
    ki18n \
    kwidgetsaddons \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
