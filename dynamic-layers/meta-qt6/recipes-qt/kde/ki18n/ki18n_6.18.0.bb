SUMMARY = "Access to the windowing system"
HOMEPAGE = "https://api.kde.org/frameworks/ki18n/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/ki18n.git;protocol=https;nobranch=1"
SRCREV = "32c3811dd8360dca9ae17cc0d72a6d437d6e583f"

DEPENDS = " \
	qtbase \
	qtwayland \
	qtwayland-native \
	qttools-native \
	extra-cmake-modules \
	kconfig \
"

inherit qt6-cmake gettext pkgconfig

do_install:append() {
    sed -i 's|${STAGING_BINDIR_NATIVE}/python3-native|${bindir}|' ${D}${libdir}/cmake/KF6I18n/KF6I18nMacros.cmake
}


FILES:${PN} += "${libdir}/qml ${libdir}/plugins/kf6 ${datadir}/qlogging-categories6"

