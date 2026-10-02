SUMMARY = "Utilities for graphical user interfaces"
HOMEPAGE = "https://api.kde.org/frameworks/kguiaddons/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kguiaddons.git;protocol=https;nobranch=1"
SRCREV = "17265ad3d8ba51d2801f477f583f0539cf4fc029"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	plasma-wayland-protocols \
"

inherit qt6-cmake mime-xdg pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_PYTHON_BINDINGS=OFF"

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

BBCLASSEXTEND = "native"
