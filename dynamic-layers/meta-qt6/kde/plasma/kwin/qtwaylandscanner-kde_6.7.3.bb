SUMMARY = "qtwaylandscanner"
HOMEPAGE = "https://invent.kde.org/plasma/kwin"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM += "file://../../../LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117"
COMPATIBLE_HOST:class-target = "null"

SRC_URI = "git://invent.kde.org/plasma/kwin.git;protocol=https;nobranch=1"
SRCREV = "45ec9a6d0ed312a803ff5658a2a3e61f221566c6"
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

