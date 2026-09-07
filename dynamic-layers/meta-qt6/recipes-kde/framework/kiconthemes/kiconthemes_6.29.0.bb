SUMMARY = "Icon GUI utilities"
HOMEPAGE = "https://api.kde.org/frameworks/kiconthemes/html/index.html"
LICENSE = "MIT AND LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kiconthemes.git;protocol=https;nobranch=1"
SRCREV = "725c44db87158e6e5d00aa01ed546f40675d5cec"

DEPENDS = " \
	breeze-icons \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	karchive \
	kconfig \
	ki18n \
	kwidgetsaddons \
	kcolorscheme \
"

inherit kf6 gettext pkgconfig

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins/kiconthemes6 ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
