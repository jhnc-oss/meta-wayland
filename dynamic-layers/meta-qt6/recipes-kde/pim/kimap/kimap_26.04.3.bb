SUMMARY = "IMAP protocol library"
HOMEPAGE = "https://invent.kde.org/pim/kimap"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=261bea1168c0bdfa73232ee90df11eb6 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/pim/kimap.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "55d2e62716274233bdeac19dabc68362b9cac429"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kmime \
    kcoreaddons \
    ki18n \
    kio \
    cyrus-sasl \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
