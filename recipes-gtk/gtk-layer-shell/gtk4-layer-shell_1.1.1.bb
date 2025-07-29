SUMMARY = "A library to write GTK applications that use Layer Shell"
HOMEPAGE = "https://github.com/wmww/gtk-layer-shell"
BUGTRACKER = "https://github.com/www/gtk-layer-shell/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=c10fc088fd05226381f6a90310ef75b5"

REQUIRED_DISTRO_FEATURES = "wayland gobject-introspection-data"

DEPENDS += " \
	gtk4 \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = " \
	git://github.com/wmww/gtk4-layer-shell.git;protocol=https;branch=main \
"

SRCREV = "4867d7b85cdf1e829fc1fd6f1d5f04c42cc99389"

inherit meson pkgconfig features_check gobject-introspection vala

EXTRA_OEMESON += "--buildtype release"

# Overwrite FILES_SOLIBSDEV to prevent “liblayer-shell-preload.so” from being added to the dev package.
FILES_SOLIBSDEV = "${libdir}/libgtk4-layer-shell.so"

FILES:${PN} += "${libdir}/liblayer-shell-preload.so"
