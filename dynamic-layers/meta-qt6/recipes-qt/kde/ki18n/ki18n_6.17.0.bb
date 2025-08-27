SUMMARY = "Access to the windowing system"
HOMEPAGE = "https://api.kde.org/frameworks/ki18n/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/ki18n.git;protocol=https;nobranch=1"
SRCREV = "a0412f78578372e130ec22738005591ada743983"

DEPENDS = " \
	qtbase \
	qtwayland \
	qtwayland-native \
	qttools-native \
	extra-cmake-modules \
	kconfig \
"

inherit qt6-cmake gettext

FILES:${PN} += "${libdir}/qml ${libdir}/plugins/kf6 ${datadir}/qlogging-categories6"
