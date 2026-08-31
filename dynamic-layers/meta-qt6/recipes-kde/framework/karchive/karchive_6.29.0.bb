SUMMARY = "Reading, creating, and manipulating file archives"
HOMEPAGE = "https://api.kde.org/frameworks/karchive/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "gitsm://invent.kde.org/frameworks/karchive.git;protocol=https;nobranch=1"
SRCREV = "646bcc56b77cf823cb96b952366d9005719e4844"

DEPENDS = " \
	bzip2 \
	extra-cmake-modules \
	openssl \
	qtbase \
	qttools-native \
	xz \
	zlib \
	zstd \
"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${datadir}/qlogging-categories6"

BBCLASSEXTEND = "native"

