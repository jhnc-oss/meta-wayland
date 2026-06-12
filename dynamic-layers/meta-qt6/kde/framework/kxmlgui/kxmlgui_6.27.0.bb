SUMMARY = "Framework for managing menu and toolbar actions"
HOMEPAGE = "https://invent.kde.org/frameworks/kxmlgui"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9"

SRC_URI = "git://invent.kde.org/frameworks/kxmlgui.git;protocol=https;nobranch=1"
SRCREV = "f29725adb7674392f0b7ab5be0b646493e2f69cd"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	kconfigwidgets \
	kcoreaddons \
	kglobalaccel \
	kitemviews \
	kguiaddons \
	ki18n \
	kiconthemes \
	kwidgetsaddons \
	python3-shiboken6-generator-native \
	python3-pyside6 \
	python3-build-native \
"

inherit qt6-cmake gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6 ${STAGING_DIR_HOST}${prefix}/metatypes
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configcore_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6coreaddons_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configgui_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6guiaddons_metatypes.json
}

FILES:${PN} += "${datadir}/qlogging-categories6  ${PYTHON_SITEPACKAGES_DIR}"

RDEPENDS:${PN} += "kconfig"
