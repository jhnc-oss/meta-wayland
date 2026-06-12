SUMMARY = "Desktop hardware abstraction"
HOMEPAGE = "https://invent.kde.org/frameworks/solid"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/solid.git;protocol=https;nobranch=1"
SRCREV = "0a346290fdabca49fa0e0b6fe6c51d55eaeda5b5"

DEPENDS = " \
    qtbase \
    qttools-native \
    libplist \
    flex-native \
    bison-native \
    extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${datadir}"

