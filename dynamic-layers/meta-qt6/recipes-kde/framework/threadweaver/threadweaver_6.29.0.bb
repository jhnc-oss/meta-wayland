SUMMARY = "Helper for multithreaded programming"
HOMEPAGE = "https://api.kde.org/frameworks/threadweaver/html/index.html"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/threadweaver.git;protocol=https;nobranch=1"
SRCREV = "a65edbe5775bdf48856118932bbf5dea5e8e3857"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
"

inherit qt6-cmake

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
