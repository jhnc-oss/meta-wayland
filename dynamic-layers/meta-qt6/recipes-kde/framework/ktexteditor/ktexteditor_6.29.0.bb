SUMMARY = "Full text editor component"
HOMEPAGE = "https://api.kde.org/frameworks/ktexteditor/html/index.html"
LICENSE = "BSD-2-Clause AND CC0-1.0 AND LGPL-2.0-only AND LGPL-2.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/frameworks/ktexteditor.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "5881ad9b27edc484a738d5d6d29283c6bd0dd8b1"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	karchive \
	kguiaddons \
	ki18n \
	kio \
	kauth \
	kparts \
	sonnet \
	syntax-highlighting \
	kcolorscheme \
"

inherit kf6 gettext

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig"
