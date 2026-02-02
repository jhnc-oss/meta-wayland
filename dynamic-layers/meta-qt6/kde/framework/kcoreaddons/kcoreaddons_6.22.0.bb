SUMMARY = "Qt addon library with a collection of non-GUI utilities"
HOMEPAGE = "https://api.kde.org/frameworks/kcoreaddons/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kcoreaddons.git;protocol=https;nobranch=1"
SRCREV = "af34a53c79e4aa568b7ba1516d9517a33f8e7915"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	plasma-wayland-protocols \
	python3-shiboken6-native \
	python3-pyside6 \
	python3-build-native \
"

inherit qt6-cmake pkgconfig mime-xdg mime

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir} ${datadir}"

