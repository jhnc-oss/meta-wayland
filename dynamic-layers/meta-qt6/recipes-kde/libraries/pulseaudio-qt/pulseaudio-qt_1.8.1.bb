SUMMARY = "Qt bindings for libpulse"
HOMEPAGE = "https://invent.kde.org/libraries/pulseaudio-qt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/libraries/pulseaudio-qt.git;protocol=https;nobranch=1"
SRCREV = "10786fe31e640858f4f5db5366aed9c56d77bfab"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    pulseaudio \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml"
