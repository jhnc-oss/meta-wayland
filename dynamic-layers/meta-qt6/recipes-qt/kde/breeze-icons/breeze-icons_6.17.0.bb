SUMMARY = "Breeze icons"
HOMEPAGE = "https://api.kde.org/frameworks/breeze-icons/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

SRC_URI = "git://invent.kde.org/frameworks/breeze-icons.git;protocol=https;nobranch=1"
SRCREV = "2a9b908671d4168fa94583f043c33f6b90aec3a7"

DEPENDS = " \
    breeze-icons-native \
    qtbase \
    qtwayland \
    qtwayland-native \
    qttools-native \
    extra-cmake-modules \
    python3-lxml-native \
"

inherit qt6-cmake pkgconfig

do_install:class-native() {
	install -d ${D}${bindir}
	install -m 755 ${B}/bin/qrcAlias ${D}${bindir}
}

FILES:${PN} += "${libdir}/qml ${datadir}/icons"

BBCLASSEXTEND = "native"
