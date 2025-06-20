SUMMARY = "This is a small library designed to make sharing and displaying of menu structures over DBus simple and easy to use."
HOMEPAGE = "https://github.com/AyatanaIndicators/libdbusmenu"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6a6a8e020838b23406c81b19c1d46df6"

SRC_URI = "git://github.com/JetBrains/libdbusmenu.git;protocol=https;branch=master"

DEPENDS = "glib-2.0 json-glib dbus gtk+ gtk+3 libdbusmenu-glib intltool-native libxslt-native"
RDEPENDS:${PN} = "libdbusmenu-glib"

PV = "16.0.4"
SRCREV = "38d7a2ada4b2a08c535491d43a39825868f2b065"

EXTRA_OECONF += "--disable-dumper --disable-gtk-doc"

inherit autotools pkgconfig gettext gobject-introspection vala gtk-doc

CFLAGS += "-Wno-error"

do_compile() {
	oe_runmake
}

do_install() {
	oe_runmake -j1 -C libdbusmenu-gtk DESTDIR="${D}" install
}

FILES:${PN} += "${datadir}"
