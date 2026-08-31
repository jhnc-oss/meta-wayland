SUMMARY = "Configuration dialog for desktop notifications"
HOMEPAGE = "https://invent.kde.org/frameworks/knotifyconfig"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/knotifyconfig.git;protocol=https;nobranch=1"
SRCREV = "52ca9313f0a73699ced2e2a62404c8491d725a9b"

DEPENDS = " \
	extra-cmake-modules \
	qtbase \
	qttools-native \
	kdbusaddons \
	kconfigwidgets \
	kio \
	ki18n \
	kconfig \
	kxmlgui \
	libcanberra \
"

inherit qt6-cmake pkgconfig gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${libdir}/qml ${PYTHON_SITEPACKAGES_DIR} ${datadir}/qlogging-categories6 ${libdir}/metatypes"

RDEPENDS:${PN} += "kconfig"
