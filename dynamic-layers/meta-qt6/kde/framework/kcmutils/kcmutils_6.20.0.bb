SUMMARY = "Utilities for KDE System Settings modules"
HOMEPAGE = "https://invent.kde.org/frameworks/kcmutils"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89"

SRC_URI = "git://invent.kde.org/frameworks/kcmutils.git;protocol=https;nobranch=1"
SRCREV = "179a38949a68fbb5879de97d5d6685aea4e5eebc"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kio \
	kitemviews \
	kconfig \
	kconfigwidgets \
	kxmlgui \
	ki18n \
	kcoreaddons \
	kguiaddons \
	kwidgetaddons \
"

inherit qt6-cmake mime-xdg gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${libdir}/qml ${datadir}"

RDEPENDS:${PN} += "kconfig"
