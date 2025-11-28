SUMMARY = "Bluedevil adds Bluetooth capabilities to KDE Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/bluedevil"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/bluedevil.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-src-kded-helpers-requestpin.cpp-fix-build-without-x1.patch"
SRCREV = "c0a248ab27959cc43bc84a96acd7ce8d56d004f9"

DEPENDS = " \
    bluez-qt \
    kcmutils \
    kcmutils-tools-native \
    kconfig-native \
    kcoreaddons \
    kdbusaddons \
    kdeclarative \
    ki18n \
    kio \
    kirigami \
    kjobwidgets \
    knotifications \
    kservice \
    ksvg \
    kwidgetaddons \
    kwindowsystem \
    libplasma \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    shared-mime-info-native \
"

inherit qt6-cmake gettext mime mime-xdg

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
	# bluedevil indeed wants to use kconfig_compiler_kf6 and kcmdesktopfilegenerator-> create links instead of touch
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "bash kconfig kpackage"
