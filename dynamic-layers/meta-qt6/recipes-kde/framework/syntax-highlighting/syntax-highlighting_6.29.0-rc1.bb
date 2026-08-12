SUMMARY = "Syntax highlighting engine for Kate syntax definitions"
HOMEPAGE = "https://invent.kde.org/frameworks/syntax-highlighting"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/frameworks/syntax-highlighting.git;protocol=https;nobranch=1"
SRCREV = "fc04c764cf9a0317bb48d207ee7bb2de2c902eb8"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	syntax-highlighting-indexer-native \
"

EXTRA_OECMAKE += "-DKATEHIGHLIGHTINGINDEXER_EXECUTABLE=${STAGING_BINDIR_NATIVE}/katehighlightingindexer"

inherit qt6-cmake pkgconfig perlnative

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"
