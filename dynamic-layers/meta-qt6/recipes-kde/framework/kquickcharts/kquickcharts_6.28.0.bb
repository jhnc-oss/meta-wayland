SUMMARY = "A QtQuick module providing high-performance charts"
HOMEPAGE = "https://invent.kde.org/frameworks/kquickcharts"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89"

SRC_URI = "git://invent.kde.org/frameworks/kquickcharts.git;protocol=https;nobranch=1"
SRCREV = "db73378145ace41ae2f7e82075d631bfecd7603d"

DEPENDS = " \
	qtbase \
	qttools-native \
	qtquick3d \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
