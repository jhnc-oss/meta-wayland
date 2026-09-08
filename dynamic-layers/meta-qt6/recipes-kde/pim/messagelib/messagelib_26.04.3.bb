SUMMARY = "Message handling libraries for KDE PIM"
HOMEPAGE = "https://invent.kde.org/pim/messagelib"
LICENSE = "BSD-3-Clause AND BSL-1.0 AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/BSL-1.0.txt;md5=e4224ccaecb14d942c71d31bef20d78c \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-only.txt;md5=5430828348d2cf7d4b5e8395f774a68e \
    file://LICENSES/GPL-2.0-or-later.txt;md5=261bea1168c0bdfa73232ee90df11eb6 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c376886bbca90fb888263b5308fd849c \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/Qt-Commercial-exception-1.0.txt;md5=d9d0aeb114751f2eea6f9e841228004a \
"

SRC_URI = "git://invent.kde.org/pim/messagelib.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "f4f4f4d4124721194c9a9f4986e2af479e284301"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtwebengine \
    kcoreaddons \
    kcodecs \
    ki18n \
    knewstuff \
    gpgmepp \
    qgpgme \
    karchive \
    kcompletion \
    kconfig \
    kcontacts \
    kiconthemes \
    kitemviews \
    kjobwidgets \
    kio \
    kservice \
    sonnet \
    ktextwidgets \
    kwidgetsaddons \
    kxmlgui \
    syntax-highlighting \
    kguiaddons \
    knotifications \
    kcolorscheme \
    ktexttemplate \
    kcalendarcore \
    akonadi \
    akonadi-mime \
    akonadi-contacts \
    grantleetheme \
    libgravatar \
    kidentitymanagement \
    libkleo \
    kmailtransport \
    kmbox \
    kmime \
    pimcommon \
    kpimtextedit \
    libkdepim \
    ktextaddons \
    akonadi-search \
    openssl \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
