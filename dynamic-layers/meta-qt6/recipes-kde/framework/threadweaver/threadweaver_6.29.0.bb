SUMMARY = "Helper for multithreaded programming"
HOMEPAGE = "https://api.kde.org/frameworks/threadweaver/html/index.html"
LICENSE = "CC0-1.0 AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/frameworks/threadweaver.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "a65edbe5775bdf48856118932bbf5dea5e8e3857"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
"

inherit qt6-cmake

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
