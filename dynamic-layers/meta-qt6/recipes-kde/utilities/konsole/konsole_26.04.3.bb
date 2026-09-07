SUMMARY = "KDE's terminal emulator"
HOMEPAGE = "https://invent.kde.org/utilities/konsole"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/utilities/konsole.git;protocol=https;nobranch=1"
SRCREV = "37022dd8fe98d7fae86d9fcbc098748f83d3d0f9"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtmultimedia \
    extra-cmake-modules \
    kconfig-native \
    kbookmarks \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kguiaddons \
    ki18n \
    kiconthemes \
    kio \
    knewstuff \
    knotifications \
    knotifyconfig \
    kparts \
    kservice \
    ktextwidgets \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    kpty \
    kdbusaddons \
    kglobalaccel \
    icu \
"

inherit qt6-cmake gettext mime mime-xdg

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DWITH_KAPSULE=OFF -DCMAKE_DISABLE_FIND_PACKAGE_KF6DocTools=ON"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig"
