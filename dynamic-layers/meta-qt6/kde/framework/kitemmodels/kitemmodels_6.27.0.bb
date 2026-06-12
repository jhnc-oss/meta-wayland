SUMMARY = "Set of item models extending the Qt model-view framework"
HOMEPAGE = "https://invent.kde.org/frameworks/kitemmodels"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kitemmodels.git;protocol=https;nobranch=1"
SRCREV = "b713738b2bef633bf1addcbcde3d5564c15f9b0f"

DEPENDS = " \
	qtbase \
	qttools-native \
	qtquick3d \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
