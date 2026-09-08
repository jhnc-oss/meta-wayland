SUMMARY = "LDAP access library"
HOMEPAGE = "https://invent.kde.org/pim/kldap"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/pim/kldap.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "b007cc98b85e86479fcb193061437eedd8b99dfa"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kio \
    ki18n \
    kwidgetsaddons \
    openldap \
    cyrus-sasl \
    qtkeychain \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
