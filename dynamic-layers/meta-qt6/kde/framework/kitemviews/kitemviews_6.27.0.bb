SUMMARY = "Set of item views extending the Qt model-view framework"
HOMEPAGE = "https://invent.kde.org/frameworks/kitemviews"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/frameworks/kitemviews.git;protocol=https;nobranch=1"
SRCREV = "90b50dceb18666753f2a813da249238a85cd4efd"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${datadir}/qlogging-categories6"
