SUMMARY = "Breeze icons"
HOMEPAGE = "https://api.kde.org/frameworks/breeze-icons/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

SRC_URI = "git://invent.kde.org/frameworks/breeze-icons.git;protocol=https;nobranch=1"
SRCREV = "81dc0bd7b6141baea1819138505f9486719d3084"

DEPENDS = " \
    breeze-icons-native \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    python3-lxml-native \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE:class-native += "-DWITH_ICON_GENERATION=OFF"

do_install:class-native() {
	install -d ${D}${bindir}
	for file in ${B}/bin/*; do
		install -m 755 $file ${D}${bindir}
	done
}

FILES:${PN} += "${libdir}/qml ${datadir}/icons"

BBCLASSEXTEND = "native"
