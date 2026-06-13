SUMMARY = "Framework for downloading and sharing additional application data"
HOMEPAGE = "https://invent.kde.org/frameworks/knewstuff"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9"

SRC_URI = "git://invent.kde.org/frameworks/knewstuff.git;protocol=https;nobranch=1"
SRCREV = "78290395ce2bdf46aa4c71f54018fd84fb669d89"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	karchive \
	kcoreaddons \
	kwidgetsaddons \
	kpackage \
	attica \
"

inherit qt6-cmake pkgconfig gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}/qlogging-categories6"
