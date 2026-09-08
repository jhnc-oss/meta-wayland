SUMMARY = "Interfacing with pseudo terminal devices"
HOMEPAGE = "https://api.kde.org/frameworks/kpty/html/index.html"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=71f739ef75581cae312e8c711bcdab16 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/frameworks/kpty.git;protocol=https;nobranch=1"
SRCREV = "96fb3da14c9ae05cf3446a067a0cd24aea68ed5e"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    ki18n \
"

inherit qt6-cmake gettext

PACKAGECONFIG ?= "utempter"
PACKAGECONFIG[utempter] = "-DUTEMPTER_EXECUTABLE=${libexecdir}/utempter/utempter,-DCMAKE_DISABLE_FIND_PACKAGE_UTEMPTER=ON,,libutempter"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${datadir}"
