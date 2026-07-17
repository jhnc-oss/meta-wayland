SUMMARY = "Plugins to allow QImage to support extra file formats"
HOMEPAGE = "https://invent.kde.org/frameworks/kimageformats"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kimageformats.git;protocol=https;nobranch=1"
SRCREV = "e6bc1af5e4773ed04a5f5cb16a27ed723bba5199"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	karchive \
	libavif \
	libheif \
	libjxl \
	jasper \
	libraw \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DENABLE_HEIF=ON"

FILES:${PN} += "${libdir} ${datadir}"
