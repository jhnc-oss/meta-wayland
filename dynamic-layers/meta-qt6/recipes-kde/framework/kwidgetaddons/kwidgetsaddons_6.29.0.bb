SUMMARY = "Widget addons"
HOMEPAGE = "https://github.com/KDE/kwidgetsaddons"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kwidgetsaddons.git;protocol=https;nobranch=1"
SRCREV = "eba8746a0ea6befd9d1081a673e5d4d363566407"

DEPENDS = " \
	clang-native \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	python3-shiboken6-generator-native \
	python3-pyside6 \
	python3-build-native \
"

inherit qt6-cmake pkgconfig

export LLVM_INSTALL_DIR = "${STAGING_DIR_NATIVE}${prefix_native}"

FILES:${PN} += "${libdir}/qml ${PYTHON_SITEPACKAGES_DIR} ${datadir}/qlogging-categories6 ${datadir}/PySide6"

RDEPENDS:${PN} += "kconfig"
