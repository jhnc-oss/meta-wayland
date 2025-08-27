SUMMARY = "Access to the windowing system"
HOMEPAGE = "https://api.kde.org/frameworks/kcolorscheme/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5"

SRC_URI = "git://invent.kde.org/frameworks/kcolorscheme.git;protocol=https;nobranch=1"
SRCREV = "7272e587bccbed92b08aeb663c31e049e881918b"

DEPENDS = " \
	qtbase \
	qtwayland \
	qtwayland-native \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	ki18n \
	kguiaddons \
"

inherit qt6-cmake gettext pkgconfig

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
