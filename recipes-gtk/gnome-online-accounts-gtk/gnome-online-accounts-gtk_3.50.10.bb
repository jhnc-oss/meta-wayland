SUMMARY = "GUI utility for logging into online accounts to sync mail, contacts and remote filesystems"
HOMEPAGE = "https://github.com/xapp-project/gnome-online-accounts-gtk"
SECTION = "x11/gnome"
LICENSE = "GPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = " \
	glib-2.0 \
	glib-2.0-native \
	gnome-online-accounts \
	gtk4 \
	libadwaita \
	libxml2-native \
"

SRC_URI = "git://github.com/xapp-project/gnome-online-accounts-gtk.git;protocol=https;branch=master"

SRCREV = "b42482522bc9089c139ceda9b8a7d81a7a149cf9"

inherit meson pkgconfig gettext gtk-icon-cache
