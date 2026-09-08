SUMMARY = "Network transparent access to files and data"
HOMEPAGE = "https://invent.kde.org/frameworks/kio"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/frameworks/kio.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "15c259aa513f168cdfacd486a121b68340bfdd2d"

DEPENDS = " \
    acl \ 
    util-linux \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    ki18n \
    kcrash \
    kbookmarks \
    kconfig \
    kcolorscheme \
    kcompletion \
    kguiaddons \
    kwidgetsaddons \
    kiconthemes \
    kitemviews \
    kjobwidgets \
    kdbusaddons\
    kwindowsystem \
    kservice \
    solid \
"

inherit kf6 gettext mime mime-xdg

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITH_X11=ON,-DWITH_X11=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/libkuriikwsfiltereng_private.so ${datadir}"
FILES:${PN}-dev = " \
	${includedir} \
	${libdir}/libKF6KIOCore.so \
	${libdir}/libKF6KIOFileWidgets.so \
	${libdir}/libKF6KIOGui.so \
	${libdir}/libKF6KIOWidgets.so \
	${libdir}/cmake \
"

RDEPENDS:${PN} += "kconfig kded"
