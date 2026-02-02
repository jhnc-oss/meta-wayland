SUMMARY = "Syntax highlighting engine for Kate syntax definitions"
HOMEPAGE = "https://invent.kde.org/frameworks/syntax-highlighting"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/frameworks/syntax-highlighting.git;protocol=https;nobranch=1"
SRCREV = "877d271d053abeaebdbc295fe9316c759ee71b41"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake pkgconfig perlnative

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
