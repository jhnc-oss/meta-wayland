SUMMARY = "A dedicated search application built on top of Baloo"
HOMEPAGE = "https://invent.kde.org/plasma/milou"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/milou.git;protocol=https;nobranch=1"
SRCREV = "cfb5c250eb3336cae8d0a77d0ce174bab1bc8849"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n \
    krunner \
    kconfig \
    libplasma \
    kpackage \
"

inherit qt6-cmake gettext

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_BINDIR}/kpackagetool6
}

EXTRA_OECMAKE += "-DWITHOUT_X11=ON -DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig kpackage krunner baloo"
