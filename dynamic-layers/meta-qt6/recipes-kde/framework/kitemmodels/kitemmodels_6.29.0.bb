SUMMARY = "Set of item models extending the Qt model-view framework"
HOMEPAGE = "https://invent.kde.org/frameworks/kitemmodels"
LICENSE = "CC0-1.0 AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

SRC_URI = "git://invent.kde.org/frameworks/kitemmodels.git;protocol=https;nobranch=1"
SRCREV = "fce2130ff7612f67b68121a8cfee436748bcace5"

DEPENDS = " \
	qtbase \
	qttools-native \
	qtquick3d \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
