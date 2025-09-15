SUMMARY = "A simple library for font loading and glyph rasterization using FontConfig, FreeType and pixman."
HOMEPAGE = "https://codeberg.org/dnkl/fcft"
BUGTRACKER = "https://codeberg.org/dnkl/fcft/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

DEPENDS = " \
	fontconfig \
	freetype \
	harfbuzz \
	pixman \
	tllist \
"

SRC_URI = " \
	git://codeberg.org/dnkl/fcft.git;protocol=https;branch=releases/3.3 \
	file://0001-generate-version.sh-dont-try-to-fetch-version-from-g.patch \
"

SRCREV = "b212e767e031891687bc6f5527ab61dddac6024e"

inherit meson pkgconfig

PACKAGECONFIG[docs] = "-Ddocs=enabled,-Ddocs=disabled,scdoc-native"
PACKAGECONFIG[grapheme-shaping] = "-Dgrapheme-shaping=enabled,-Dgrapheme-shaping=disabled,utf8proc"
PACKAGECONFIG[run-shaping] = "-Drun-shaping=enabled,-Drun-shaping=disabled,utf8proc"

PACKAGECONFIG ?= " \
	grapheme-shaping \
	run-shaping \
"

BBCLASSEXTEND = ""

