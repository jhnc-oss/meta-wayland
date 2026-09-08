SUMMARY = "Calendar access library implementing iCalendar (RFC 2445)"
HOMEPAGE = "https://invent.kde.org/frameworks/kcalendarcore"
LICENSE = "BSD-3-Clause AND LGPL-2.0-or-later AND LGPL-3.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=c376886bbca90fb888263b5308fd849c \
"

SRC_URI = "git://invent.kde.org/frameworks/kcalendarcore.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "d59088887c0bfa14306e580ef0fb9a4bacd754c4"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    libical \
    qtdeclarative \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_PYTHON_BINDINGS=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
