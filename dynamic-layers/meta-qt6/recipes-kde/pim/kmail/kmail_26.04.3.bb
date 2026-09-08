SUMMARY = "Mail client of KDE"
HOMEPAGE = "https://invent.kde.org/pim/kmail"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GFDL-1.2-or-later AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LicenseRef-KDE-Accepted-GPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/GPL-2.0-only.txt;md5=5430828348d2cf7d4b5e8395f774a68e \
    file://LICENSES/GPL-2.0-or-later.txt;md5=261bea1168c0bdfa73232ee90df11eb6 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/Qt-Commercial-exception-1.0.txt;md5=d9d0aeb114751f2eea6f9e841228004a \
"

SRC_URI = "git://invent.kde.org/pim/kmail.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "17f2c9f20ecfccf898d9b7458f49e91442e04891"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtwebengine \
    messagelib \
    akonadi-search \
    gpgmepp \
    kbookmarks \
    kconfig \
    kcrash \
    kdbusaddons \
    kguiaddons \
    ki18n \
    kitemviews \
    kjobwidgets \
    kio \
    kcmutils \
    knotifications \
    knotifyconfig \
    kparts \
    kservice \
    sonnet \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    kiconthemes \
    kcontacts \
    kcalendarcore \
    kstatusnotifieritem \
    akonadi \
    akonadi-contacts \
    akonadi-mime \
    kcalutils \
    kidentitymanagement \
    kldap \
    kmailtransport \
    kpimtextedit \
    kontactinterface \
    kmime \
    libgravatar \
    libkdepim \
    libkleo \
    libksieve \
    mailcommon \
    pimcommon \
    ktnef \
    libgpg-error \
    ktextaddons \
    qtkeychain \
    kuserfeedback \
    plasma-activities \
"

inherit kf6 gettext pkgconfig mime mime-xdg

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"

RDEPENDS:${PN} += "kdepim-runtime kmail-account-wizard akonadi"
