SUMMARY = "Common mail handling code for KDE PIM"
HOMEPAGE = "https://invent.kde.org/pim/mailcommon"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-only.txt;md5=5430828348d2cf7d4b5e8395f774a68e \
    file://LICENSES/GPL-2.0-or-later.txt;md5=261bea1168c0bdfa73232ee90df11eb6 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c376886bbca90fb888263b5308fd849c \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/pim/mailcommon.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "1d26024c5296639e750d425dc4a932a59c404fa8"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    libxslt-native \
    qtmultimedia \
    gpgmepp \
    qgpgme \
    karchive \
    kcompletion \
    kconfig \
    ki18n \
    kiconthemes \
    kitemmodels \
    kitemviews \
    kio \
    kwidgetsaddons \
    kxmlgui \
    kdbusaddons \
    syntax-highlighting \
    kguiaddons \
    kcodecs \
    kcolorscheme \
    akonadi \
    akonadi-mime \
    libkdepim \
    mailimporter \
    kmailtransport \
    messagelib \
    kmime \
    pimcommon \
    akonadi-contacts \
    kidentitymanagement \
    ktextaddons \
    plasma-activities \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
