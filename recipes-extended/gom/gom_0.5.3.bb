SUMMARY = "libgom - GObject Data Mapper."
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

GNOMEBASEBUILDCLASS = "meson"

DEPENDS = "sqlite3 glib-2.0 gdk-pixbuf python3-pygobject-native"

inherit gnomebase pkgconfig gobject-introspection
GIR_MESON_OPTION = ""

SRC_URI = "https://download.gnome.org/sources/gom/0.5/gom-${PV}.tar.xz;name=archive"
SRC_URI[archive.sha256sum] = "069d0909fbdc6b4d27edf7a879366194e3ab508b03548bf5b89ff63546d20177"

FILES:${PN} += "${datadir} ${libdir}"

