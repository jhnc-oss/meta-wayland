SUMMARY = "Address book library supporting vCard"
HOMEPAGE = "https://invent.kde.org/frameworks/kcontacts"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.0-or-later AND MIT AND Unicode-DFS-2016"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/Unicode-DFS-2016.txt;md5=3daac258519ec32945c80ae0f7ba88f4 \
"

SRC_URI = "git://invent.kde.org/frameworks/kcontacts.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "52bb1a610ad70cce9282bb7c9afb21a3a72a827b"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n \
    kconfig \
    kcodecs \
    qtdeclarative \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_PYTHON_BINDINGS=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
