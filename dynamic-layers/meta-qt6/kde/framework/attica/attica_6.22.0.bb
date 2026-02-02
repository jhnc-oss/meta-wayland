SUMMARY = "Open Collaboration Service client library"
HOMEPAGE = "https://invent.kde.org/frameworks/attica"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/attica.git;protocol=https;nobranch=1"
SRCREV = "f6343034c9a77dee0289d9715a3fe80f8c5c558b"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${datadir}/qlogging-categories6"

