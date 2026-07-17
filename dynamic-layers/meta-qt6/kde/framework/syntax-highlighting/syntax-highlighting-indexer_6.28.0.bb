SUMMARY = "Syntax highlighting indexer for Kate syntax definitions"
HOMEPAGE = "https://invent.kde.org/frameworks/syntax-highlighting"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/frameworks/syntax-highlighting.git;protocol=https;nobranch=1"
SRCREV = "956564c23b233d7fa99218745909f823457e763f"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake pkgconfig perlnative

do_install() {
	install -d ${D}${bindir}
	install -m0755 ${B}/bin/katehighlightingindexer ${D}${bindir}
}

BBCLASSEXTEND = "native"
