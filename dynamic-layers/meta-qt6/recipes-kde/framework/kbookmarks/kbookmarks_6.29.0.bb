SUMMARY = "Bookmarks management library"
HOMEPAGE = "https://invent.kde.org/frameworks/kbookmarks"
LICENSE = "CC0-1.0 AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/frameworks/kbookmarks.git;protocol=https;nobranch=1;tag=v6.29.0"
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
