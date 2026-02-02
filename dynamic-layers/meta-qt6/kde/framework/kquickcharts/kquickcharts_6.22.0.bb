SUMMARY = "A QtQuick module providing high-performance charts"
HOMEPAGE = "https://invent.kde.org/frameworks/kquickcharts"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89"

SRC_URI = "git://invent.kde.org/frameworks/kquickcharts.git;protocol=https;nobranch=1"
SRCREV = "3f685898464abe640eeb07763fb48c652bc492e1"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
