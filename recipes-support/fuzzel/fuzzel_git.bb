SUMMARY = "Fuzzel is a Wayland-native application launcher."
HOMEPAGE = "https://codeberg.org/dnkl/fuzzel"
BUGTRACKER = "https://codeberg.org/dnkl/fuzzel/issues"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://codeberg.org/dnkl/fuzzel.git;protocol=https;branch=releases/1.12 \
"

DEPENDS = " \
	fcft \
	libxkbcommon \
	pixman \
	scdoc-native \
	tllist \
	wayland \
	wayland-native \
	wayland-protocols \
"

PV = "1.12.0"
SRCREV = "05270d0458310abecec94a65c6e96b90db70e47a"

inherit meson pkgconfig features_check

PACKAGECONFIG[png] = "-Dpng-backend=libpng,-Dpng-backend=none,libpng"
PACKAGECONFIG[librsvg] = "-Dsvg-backend=librsvg -Denable-cairo=enabled,-Dsvg-backend=nanosvg -Denable-cairo=disabled,cairo librsvg"

PACKAGECONFIG ?= " \
	png \
	librsvg \
"

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"
