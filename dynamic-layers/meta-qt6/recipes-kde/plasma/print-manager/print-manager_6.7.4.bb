SUMMARY = "Printer management for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/print-manager"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/print-manager.git;protocol=https;nobranch=1"
SRCREV = "a0c4a3bba4871c243d7d79bacda22bbc50e1466f"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig \
    kconfig-native \
    kcmutils-tools-native \
    kconfigwidgets \
    kcoreaddons \
    kdbusaddons \
    ki18n \
    kcmutils \
    kirigami \
    kirigami-addons \
    kitemmodels \
    kdeclarative \
    kio \
    knotifications \
    kwidgetsaddons \
    kwindowsystem \
    libplasma \
    cups \
"

inherit qt6-cmake gettext pkgconfig

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DSCP_INSTALL=OFF \
    -DCMAKE_DISABLE_FIND_PACKAGE_PackageKitQt6=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_CupsSmb=ON \
"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${libdir}/libkcups.so ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig kpackage kirigami-addons kitemmodels kdeclarative cups cups-pk-helper"

INSANE_SKIP:${PN} = "dev-so"
