SUMMARY = "Library for accessing Google services"
HOMEPAGE = "https://invent.kde.org/pim/libkgapi"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c376886bbca90fb888263b5308fd849c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/pim/libkgapi.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "7a4cacd758b7a31e0b2f332df9b48d52987a5ce1"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kwallet \
    kcalendarcore \
    kcontacts \
    cyrus-sasl \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir} ${libdir}/sasl2"
INSANE_SKIP:${PN} += "dev-so"
