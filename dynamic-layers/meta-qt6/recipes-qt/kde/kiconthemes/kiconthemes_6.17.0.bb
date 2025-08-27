SUMMARY = "Icon GUI utilities"
HOMEPAGE = "https://api.kde.org/frameworks/kiconthemes/html/index.html"
LICENSE = "MIT & LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kiconthemes.git;protocol=https;nobranch=1"
SRCREV = "cc6686960cf12ffe63296fe4a5118d5466b10e8f"

DEPENDS = " \
	breeze-icons \
	qtbase \
	qtwayland \
	qtwayland-native \
	qttools-native \
	extra-cmake-modules \
	karchive \
	kconfig \
	ki18n \
	kwidgetaddons \
	kcolorscheme \
"

inherit qt6-cmake gettext pkgconfig

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins/kiconthemes6 ${datadir}/qlogging-categories6"
