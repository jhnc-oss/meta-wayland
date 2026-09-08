SUMMARY = "Account wizard for KMail"
HOMEPAGE = "https://invent.kde.org/pim/kmail-account-wizard"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GFDL-1.2-or-later AND GPL-2.0-or-later AND LGPL-2.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=261bea1168c0bdfa73232ee90df11eb6 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/pim/kmail-account-wizard.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "92621801753451509ca0fe655e16e06c09410ecc"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtdeclarative \
    ki18n \
    kdbusaddons \
    kcrash \
    kio \
    kiconthemes \
    kmime \
    akonadi \
    kidentitymanagement \
    kmailtransport \
    qtkeychain \
"

inherit kf6 gettext pkgconfig mime-xdg

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
