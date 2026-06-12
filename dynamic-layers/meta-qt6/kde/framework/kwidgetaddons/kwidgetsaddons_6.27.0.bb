SUMMARY = "Widget addons"
HOMEPAGE = "https://github.com/KDE/kwidgetsaddons"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kwidgetsaddons.git;protocol=https;nobranch=1"
SRCREV = "7e19d066d8b51fd348f24ca9e1a74258ba54fbcb"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	python3-shiboken6-generator-native \
	python3-pyside6 \
	python3-build-native \
"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${libdir}/qml ${PYTHON_SITEPACKAGES_DIR} ${datadir}/qlogging-categories6 ${datadir}/PySide6"

RDEPENDS:${PN} += "kconfig"
