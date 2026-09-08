SUMMARY = "MIME message library"
HOMEPAGE = "https://invent.kde.org/pim/kmime"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.0-only AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/pim/kmime.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "bb7f8a0177ba79e8b06d6d8ac81078202da8e0b4"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcodecs \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
