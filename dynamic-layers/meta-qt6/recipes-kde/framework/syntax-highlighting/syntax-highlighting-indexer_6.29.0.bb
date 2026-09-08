SUMMARY = "Syntax highlighting indexer for Kate syntax definitions"
HOMEPAGE = "https://invent.kde.org/frameworks/syntax-highlighting"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-3.0-or-later AND LGPL-2.0-or-later AND LGPL-2.1-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89 \
    file://LICENSES/BSD-3-Clause.txt;md5=71f739ef75581cae312e8c711bcdab16 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=75d892af193fd5a298f724c4377d8f62 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/frameworks/syntax-highlighting.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "fc04c764cf9a0317bb48d207ee7bb2de2c902eb8"

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
