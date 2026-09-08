SUMMARY = "Native Utilities for KDE System Settings modules"
HOMEPAGE = "https://invent.kde.org/frameworks/kcmutils"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89 \
    file://LICENSES/BSD-3-Clause.txt;md5=71f739ef75581cae312e8c711bcdab16 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=3d26203303a722dedc6bf909d95ba815 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-only.txt;md5=7b8fde44990707e743d3613054065137 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=6a2eced623a7c9d0c8996ce24917d006 \
"
COMPATIBLE_HOST:class-target = "null"

SRC_URI = "git://invent.kde.org/frameworks/kcmutils.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "ec2a6709df71b4c0145e90047294df4575f5ccc2"

DEPENDS = "qtbase qttools-native extra-cmake-modules"

inherit qt6-cmake

EXTRA_OECMAKE += "-DTOOLS_ONLY=ON"

BBCLASSEXTEND = "native"
