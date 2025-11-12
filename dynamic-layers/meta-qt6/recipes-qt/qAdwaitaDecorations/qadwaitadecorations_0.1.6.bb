SUMMARY = "Qt decoration plugin implementing Adwaita-like client-side decorations."
HOMEPAGE = "https://github.com/FedoraQt/QAdwaitaDecorations"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1803fa9c2c3ce8cb06b4861d75310742"

DEPENDS = " \
	qtbase \
	qtsvg \
"

inherit qt6-cmake

EXTRA_OECMAKE += "-DUSE_QT6=ON"

SRC_URI = "git://github.com/FedoraQt/QAdwaitaDecorations.git;protocol=https;nobranch=1"

SRCREV = "d70c24a745e2f2195222400f901cb3a9296f28b5"

FILES:${PN} += "${libdir}"
