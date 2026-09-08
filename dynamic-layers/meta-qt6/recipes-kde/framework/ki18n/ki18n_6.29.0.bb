SUMMARY = "Access to the windowing system"
HOMEPAGE = "https://api.kde.org/frameworks/ki18n/html/index.html"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL AND ODbL-1.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/ODbL-1.0.txt;md5=3f52b15a33709232a08eae2558d7ad91 \
"

SRC_URI = "git://invent.kde.org/frameworks/ki18n.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "0db3cf4e3e38360048bf8665efa74911ce4d2696"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	gettext-native \
"

inherit qt6-cmake gettext pkgconfig

do_install:append() {
    sed -i 's|${STAGING_BINDIR_NATIVE}/python3-native|${bindir}|' ${D}${libdir}/cmake/KF6I18n/KF6I18nMacros.cmake
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins/kf6 ${datadir}/qlogging-categories6"

BBCLASSEXTEND = "native"

RDEPENDS:${PN} += "kconfig"
