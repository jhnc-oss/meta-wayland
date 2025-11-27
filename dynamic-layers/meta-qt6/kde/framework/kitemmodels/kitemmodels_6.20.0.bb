SUMMARY = "Set of item models extending the Qt model-view framework"
HOMEPAGE = "https://invent.kde.org/frameworks/kitemmodels"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kitemmodels.git;protocol=https;nobranch=1"
SRCREV = "da8b6c38b7ad75b6fa2d5d44051b35980c76acd1"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
