SUMMARY = "Cryptography library for KDE PIM"
HOMEPAGE = "https://invent.kde.org/pim/libkleo"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-or-later AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GCC-exception-3.1.txt;md5=79b406dbc4f491ae4219de5e09a2a4d3 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1ebbd3e34237af26da5dc08a4e440464 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/pim/libkleo.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "bf2db65f8ea0f36e062892c31d859dd8baf349ac"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n \
    kconfig \
    kwidgetsaddons \
    kcolorscheme \
    kcompletion \
    kcoreaddons \
    kcodecs \
    kitemmodels \
    gpgmepp \
    qgpgme \
    libgpg-error \
    boost \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
