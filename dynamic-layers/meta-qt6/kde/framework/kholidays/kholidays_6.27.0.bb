SUMMARY = "Execute actions as privileged user"
HOMEPAGE = "https://invent.kde.org/frameworks/kholidays"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2"

SRC_URI = "git://invent.kde.org/frameworks/kholidays.git;protocol=https;nobranch=1"
SRCREV = "abbd4e62fa382421536119d938c3ee47f62f3b4f"

DEPENDS = " \
    bison-native \
    qtbase \
    qttools-native \
    extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

