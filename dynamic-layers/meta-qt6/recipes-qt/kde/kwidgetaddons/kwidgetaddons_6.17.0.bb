SUMMARY = "Widget addons"
HOMEPAGE = "https://github.com/KDE/kwidgetsaddons"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://github.com/KDE/kwidgetsaddons.git;protocol=https;nobranch=1"
SRCREV = "272bd685591e321b0fda52ef21fcc30fc75ef9d2"

DEPENDS = " \
	qtbase \
	qtwayland \
	qtwayland-native \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	python3-shiboken6-native \
	python3-pyside6 \
	python3-build-native \
"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${libdir}/qml ${PYTHON_SITEPACKAGES_DIR} ${datadir}/qlogging-categories6"
