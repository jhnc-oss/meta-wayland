SUMMARY = "Various text handling addons for KDE applications"
HOMEPAGE = "https://invent.kde.org/libraries/ktextaddons"
LICENSE = "BSD-3-Clause AND CC-BY-SA-4.0 AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-or-later AND LGPL-2.1-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC-BY-SA-4.0.txt;md5=7130783469368ceb248a4f03e89ea4b8 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=261bea1168c0bdfa73232ee90df11eb6 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/libraries/ktextaddons.git;protocol=https;nobranch=1;tag=v2.1.2"
SRCREV = "1e756cf9338287ed90a7632697a576533a181648"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtmultimedia \
    kio \
    kconfig \
    kcoreaddons \
    ki18n \
    kwidgetsaddons \
    kxmlgui \
    kconfigwidgets \
    sonnet \
    syntax-highlighting \
    ktextwidgets \
    kcolorscheme \
    qtkeychain \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
