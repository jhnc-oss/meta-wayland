SUMMARY = "Execute actions as privileged user"
HOMEPAGE = "https://invent.kde.org/frameworks/kauth"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kauth.git;protocol=https;nobranch=1"
SRCREV = "4ab64c03de56df3a0ba703596244b1a395ab742a"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/plugins ${datadir}"

