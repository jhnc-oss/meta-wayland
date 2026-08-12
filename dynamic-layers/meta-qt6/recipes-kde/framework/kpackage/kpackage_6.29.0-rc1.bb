SUMMARY = "Installation and loading of additional content as packages"
HOMEPAGE = "https://invent.kde.org/frameworks/kpackage"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kpackage.git;protocol=https;nobranch=1"
SRCREV = "a238be9276effc86474ca92837eccdae48f2b3c0"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    karchive \
    ki18n \
    kcoreaddons \
"

inherit qt6-cmake gettext

FILES:${PN} += "${datadir}"
