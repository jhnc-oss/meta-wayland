SUMMARY = "Network transparent access to files and data"
HOMEPAGE = "https://invent.kde.org/frameworks/kio"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kio.git;protocol=https;nobranch=1"
SRCREV = "1f471941c4be1de739322ed302266aea85de68c7"

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
    kwidgetaddons \
    kiconthemes \
    kitemviews \
    kjobwidgets \
    kdbusaddons\
    kwindowsystem \
    kservice \
    solid \
"

inherit qt6-cmake gettext mime mime-xdg

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

EXTRA_OECMAKE += "-DWITH_X11=OFF"


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
