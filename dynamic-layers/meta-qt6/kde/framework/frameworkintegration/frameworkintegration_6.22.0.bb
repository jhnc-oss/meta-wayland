SUMMARY = "Integration of Qt application with KDE workspaces"
HOMEPAGE = "https://invent.kde.org/frameworks/frameworkintegration"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/frameworkintegration.git;protocol=https;nobranch=1"
SRCREV = "ac3d6438eea174f9cadd3e641ce9f938d282ca02"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kwidgetaddons \
    kconfig \
    kcolorscheme \
    kiconthemes \
    knotifications \
    kpackage \
    ki18n \
    knewstuff \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_BINDIR}/kpackagetool6
}

FILES:${PN} += "${libdir}/plugins ${datadir}"

