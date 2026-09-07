SUMMARY = "Classes to read and interact with KColorScheme"
HOMEPAGE = "https://api.kde.org/frameworks/kcolorscheme/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5"

SRC_URI = "git://invent.kde.org/frameworks/kcolorscheme.git;protocol=https;nobranch=1"
SRCREV = "c88bf7184bbae0f819b01ae65ef1b85f3003ba01"

DEPENDS = " \
	appstream-native \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	ki18n \
	kguiaddons \
"

inherit kf6 gettext pkgconfig

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
