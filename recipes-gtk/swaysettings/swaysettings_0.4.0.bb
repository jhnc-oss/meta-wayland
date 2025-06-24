SUMMARY = "A GUI for configuring your sway desktop"
HOMEPAGE = "https://github.com/ErikReider/SwaySettings"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"


DEPENDS = " \
	accountsservice \
	gtk+3 \
	glib-2.0 \
	granite6 \
	gtk-layer-shell \
	json-glib \
	libgee \
	libhandy \
	libxml2 \
	pulseaudio \
	xkeyboard-config \
"

SRC_URI = "git://github.com/ErikReider/SwaySettings.git;protocol=https;nobranch=1"

SRCREV = "8fb6210ad123654f3988cb8f3f59ab629bb0a747"

inherit meson pkgconfig vala

FILES:${PN} += "${datadir}"
