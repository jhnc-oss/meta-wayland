SUMMARY = "Desktop hardware abstraction"
HOMEPAGE = "https://invent.kde.org/frameworks/solid"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/solid.git;protocol=https;nobranch=1"
SRCREV = "5fc8aa2643f387a5e3223d112a28e84f0c44056b"

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

