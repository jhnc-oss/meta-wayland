SUMMARY = "qtwaylandscanner"
HOMEPAGE = "https://invent.kde.org/plasma/kwin"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM += "file://../../../LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117"
COMPATIBLE_HOST:class-target = "null"

SRC_URI = "git://invent.kde.org/plasma/kwin.git;protocol=https;nobranch=1"
SRCREV = "c87d5d545009fe3e9be452b28db6f595c299874e"
S = "${UNPACKDIR}/${BPN}-${PV}/src/wayland/tools"
DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${B}/qtwaylandscanner_kde ${D}${bindir}
}

BBCLASSEXTEND = "native"

