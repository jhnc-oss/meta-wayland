SUMMARY = "Set of item views extending the Qt model-view framework"
HOMEPAGE = "https://invent.kde.org/frameworks/kitemviews"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/frameworks/kitemviews.git;protocol=https;nobranch=1"
SRCREV = "a07ef4f8cc5355675fc1c2061c6553c036a3c8b0"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${datadir}/qlogging-categories6"
