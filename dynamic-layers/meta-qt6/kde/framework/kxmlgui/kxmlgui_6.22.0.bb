SUMMARY = "Framework for managing menu and toolbar actions"
HOMEPAGE = "https://invent.kde.org/frameworks/kxmlgui"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9"

SRC_URI = "git://invent.kde.org/frameworks/kxmlgui.git;protocol=https;nobranch=1"
SRCREV = "cc8ef30b396de591ca0cc261a4776d56c2615bc1"

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
	kwidgetaddons \
	python3-shiboken6-native \
	python3-pyside6 \
	python3-build-native \
"

inherit qt6-cmake gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${datadir}/qlogging-categories6  ${PYTHON_SITEPACKAGES_DIR}"

RDEPENDS:${PN} += "kconfig"
