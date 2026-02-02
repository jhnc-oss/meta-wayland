SUMMARY = "Global desktop keyboard shortcuts"
HOMEPAGE = "https://invent.kde.org/frameworks/kglobalaccel"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kglobalaccel.git;protocol=https;nobranch=1"
SRCREV = "034e5f9695f26ad8d11b010c432ebdc30cd01ca5"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${datadir}"

