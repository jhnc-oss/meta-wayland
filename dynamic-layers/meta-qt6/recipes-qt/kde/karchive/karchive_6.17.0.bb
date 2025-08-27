SUMMARY = "Reading, creating, and manipulating file archives"
HOMEPAGE = "https://api.kde.org/frameworks/karchive/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/karchive.git;protocol=https;nobranch=1"
SRCREV = "69712e2d9ca0ea195a78ff0e9c509592c3e98a01"

DEPENDS = " \
	bzip2 \
	extra-cmake-modules \
	zstd \
	openssl \
	qtbase \
	qtwayland \
	qtwayland-native \
	qttools-native \
	extra-cmake-modules \
	zlib \
"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${datadir}/qlogging-categories6"
