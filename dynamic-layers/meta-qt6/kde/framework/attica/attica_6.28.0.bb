SUMMARY = "Open Collaboration Service client library"
HOMEPAGE = "https://invent.kde.org/frameworks/attica"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/attica.git;protocol=https;nobranch=1"
SRCREV = "3732da149170cf3acca379f42f16778be7cd6417"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${datadir}/qlogging-categories6"

