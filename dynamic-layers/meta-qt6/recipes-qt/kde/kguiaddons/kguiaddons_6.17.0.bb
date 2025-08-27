SUMMARY = "Utilities for graphical user interfaces"
HOMEPAGE = "https://api.kde.org/frameworks/kguiaddons/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kguiaddons.git;protocol=https;nobranch=1"
SRCREV = "757c799124995689000e4a4664a675ef77775595"

DEPENDS = " \
	qtbase \
	qtwayland \
	qtwayland-native \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	plasma-wayland-protocols \
	python3-shiboken6-native \
	python3-pyside6 \
	python3-build-native \
"

inherit qt6-cmake mime-xdg pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${PYTHON_SITEPACKAGES_DIR} ${datadir}/qlogging-categories6"

BBCLASSEXTEND = "native"
