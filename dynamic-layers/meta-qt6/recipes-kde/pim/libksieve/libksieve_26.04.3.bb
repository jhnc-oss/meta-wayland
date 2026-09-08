SUMMARY = "Sieve mail filtering library"
HOMEPAGE = "https://invent.kde.org/pim/libksieve"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND LGPL-2.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-only.txt;md5=5430828348d2cf7d4b5e8395f774a68e \
    file://LICENSES/GPL-2.0-or-later.txt;md5=261bea1168c0bdfa73232ee90df11eb6 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/pim/libksieve.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "621fa11c669c791181fcc3bf6abc73f1885017be"

DEPENDS = " \
    qtbase \
    qtwebengine \
    qttools-native \
    extra-cmake-modules \
    cyrus-sasl \
    ki18n \
    kcolorscheme \
    kio \
    kcoreaddons \
    kiconthemes \
    pimcommon \
    libkdepim \
    knewstuff \
    karchive \
    syntax-highlighting \
    sonnet \
    kmime \
    kidentitymanagement \
    kmailtransport \
    kimap \
    ktextaddons \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
