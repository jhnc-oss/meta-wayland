SUMMARY = "Graceful handling of application crashes"
HOMEPAGE = "https://invent.kde.org/frameworks/kcrash"
LICENSE = "CC0-1.0 AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kcrash.git;protocol=https;nobranch=1"
SRCREV = "544e1f29293566b24c5a1acb9a42dbc62b3df8c8"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
"

inherit qt6-cmake


FILES:${PN} += "${datadir}"

