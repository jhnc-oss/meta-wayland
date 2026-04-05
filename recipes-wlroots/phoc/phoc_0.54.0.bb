
SUMMARY = "wlroots based Phone compositor as used on the Librem5."
HOMEPAGE = "https://gitlab.gnome.org/World/Phosh/phoc"
SECTION = "graphics"
LICENSE = "GPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://LICENSES/GPL-3.0-or-later.txt;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	gi-docgen-native \
	glib-2.0 \
	gmobile \
	gnome-desktop \
	libinput \
	libxkbcommon \
	pixman \
	seatd \
	wayland \
	wayland-native \
	wayland-protocols \
	wlroots-0.19 \
"

SRC_URI = "git://gitlab.gnome.org/World/Phosh/phoc.git;protocol=https;nobranch=1;name=phoc"
SRC_URI += "git://gitlab.gnome.org/GNOME/gvdb.git;protocol=https;subdir=${S}/subprojects/gvdb;name=gvdb;nobranch=1"

SRCREV_phoc = "c95299804a7be6eda53afa2ac6f37f6d97e57081"
SRCREV_gvdb = "4758f6fb7f889e074e13df3f914328f3eecb1fd3"
SRCREV_FORMAT = "phoc"

inherit features_check gsettings meson pkgconfig

PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,eudev elogind"
PACKAGECONFIG[x11] = ",,libxcb xcb-util-renderutil"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland xcb-util-wm"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
"

EXTRA_OEMESON += "-Dembed-wlroots=disabled --buildtype=release"

FILES:${PN} += "${datadir}"

