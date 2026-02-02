SUMMARY = "Execute actions as privileged user"
HOMEPAGE = "https://invent.kde.org/frameworks/kholidays"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2"

SRC_URI = "git://invent.kde.org/frameworks/kholidays.git;protocol=https;nobranch=1"
SRCREV = "ed0d328a66411635c33046b0c5e52655599c0acb"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}"

