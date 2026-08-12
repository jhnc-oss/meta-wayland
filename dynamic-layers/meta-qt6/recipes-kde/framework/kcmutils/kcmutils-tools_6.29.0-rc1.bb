SUMMARY = "Native Utilities for KDE System Settings modules"
HOMEPAGE = "https://invent.kde.org/frameworks/kcmutils"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89"
COMPATIBLE_HOST:class-target = "null"

SRC_URI = "git://invent.kde.org/frameworks/kcmutils.git;protocol=https;nobranch=1"
SRCREV = "ec2a6709df71b4c0145e90047294df4575f5ccc2"

DEPENDS = "qtbase qttools-native extra-cmake-modules"

inherit qt6-cmake

EXTRA_OECMAKE += "-DTOOLS_ONLY=ON"

BBCLASSEXTEND = "native"
