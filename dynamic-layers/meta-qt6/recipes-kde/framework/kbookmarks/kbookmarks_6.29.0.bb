SUMMARY = "Bookmarks management library"
HOMEPAGE = "https://invent.kde.org/frameworks/kbookmarks"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kbookmarks.git;protocol=https;nobranch=1"
SRCREV = "01bfbb1ca50bb6bc7e386301406cc9a3fe3f5ed2"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	kcoreaddons\
	kwidgetsaddons \
"

inherit kf6 gettext pkgconfig

FILES:${PN} += "${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
