SUMMARY = "Desktop hardware abstraction"
HOMEPAGE = "https://invent.kde.org/frameworks/solid"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/solid.git;protocol=https;nobranch=1"
SRCREV = "c51f18eac79ff0edfc1dcb45fde3d2f4e33722af"

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

