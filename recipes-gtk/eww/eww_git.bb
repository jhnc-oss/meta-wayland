SUMMARY = "Elkowars Wacky Widgets is a standalone widget system that allows to implement custom widgets"
HOMEPAGE = "https://github.com/elkowar/eww"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d81de17da6959c5c270f4d3fc49ab073"

DEPENDS = " \
	atk \
	cairo \
	dbus-glib \
	glib-2.0 \
	gtk-layer-shell \
	gdk-pixbuf \
	gtk+3 \
	libdbusmenu-glib \
	libdbusmenu-gtk \
	pango \
"

require eww-crates.inc

SRC_URI += "git://github.com/elkowar/eww.git;protocol=https;nobranch=1"

PV = "0.6.0+git"
SRCREV = "0e409d4a52bd3d37d0aa0ad4e2d7f3b9a8adcdb7"
S = "${WORKDIR}/git"

inherit cargo rust cargo-update-recipe-crates pkgconfig

