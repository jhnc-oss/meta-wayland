SUMMARY = "Network transparent access to files and data"
HOMEPAGE = "https://invent.kde.org/frameworks/kio"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kio.git;protocol=https;nobranch=1"
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
