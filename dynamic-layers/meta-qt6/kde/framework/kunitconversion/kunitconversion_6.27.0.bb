SUMMARY = "Converting physical units"
HOMEPAGE = "https://invent.kde.org/frameworks/kunitconversion"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kunitconversion.git;protocol=https;nobranch=1"
SRCREV = "050bd7851fefdb66f94fdb2ea9a27f12756b70ce"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n \
    python3-shiboken6-generator-native \
    python3-pyside6 \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir} ${datadir}/qlogging-categories6"
