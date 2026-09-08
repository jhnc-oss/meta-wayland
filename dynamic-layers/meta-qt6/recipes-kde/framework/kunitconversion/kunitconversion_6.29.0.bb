SUMMARY = "Converting physical units"
HOMEPAGE = "https://invent.kde.org/frameworks/kunitconversion"
LICENSE = "CC0-1.0 AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/frameworks/kunitconversion.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "172ca8b7f9d6a5af58e65ef0b21116bfb0ff5a35"

DEPENDS = " \
    clang-native \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n \
    python3-shiboken6-generator-native \
    python3-pyside6 \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

export LLVM_INSTALL_DIR = "${STAGING_DIR_NATIVE}${prefix_native}"

FILES:${PN} += "${libdir} ${datadir}/qlogging-categories6"
