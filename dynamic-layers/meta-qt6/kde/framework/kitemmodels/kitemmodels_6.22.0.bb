SUMMARY = "Set of item models extending the Qt model-view framework"
HOMEPAGE = "https://invent.kde.org/frameworks/kitemmodels"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kitemmodels.git;protocol=https;nobranch=1"
SRCREV = "9ddc111ef4a5a546870547071f96c0a64dd89cba"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
