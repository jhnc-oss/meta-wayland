SUMMARY = "A GUI for configuring your sway desktop"
HOMEPAGE = "https://github.com/ErikReider/SwaySettings"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"


DEPENDS = " \
	accountsservice \
	blueprint-compiler-native \
	gdk-pixbuf \
	glib-2.0 \
	granite \
	gtk4 \
	gtk4-layer-shell \
	json-glib \
	libadwaita \
	libgee \
	libgtop \
	libxml2 \
	pulseaudio \
	udisks2 \
	xkeyboard-config \
"

SRC_URI = " \
	git://github.com/ErikReider/SwaySettings.git;protocol=https;nobranch=1;tag=v0.5.0 \
	file://0001-Fixed-Fedora-43-build-issues.patch \
"

SRCREV = "01348701fc0a66d0dcf978d1b3ce67da29c8669c"

inherit meson pkgconfig vala

FILES:${PN} += "${datadir}"

export GI_TYPELIB_PATH = "${STAGING_LIBDIR}/girepository-1.0/"
