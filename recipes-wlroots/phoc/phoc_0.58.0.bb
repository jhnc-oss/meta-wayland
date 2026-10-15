
SUMMARY = "wlroots based Phone compositor as used on the Librem5."
HOMEPAGE = "https://gitlab.gnome.org/World/Phosh/phoc"
SECTION = "graphics"
LICENSE = "GPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://LICENSES/GPL-3.0-or-later.txt;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	gi-docgen-native \
	glib-2.0 \
	glslang-native \
	gmobile \
	gnome-desktop \
	hwdata-native \
	libdisplay-info \
	libdrm \
	libinput \
	libxkbcommon \
	pixman \
	seatd \
	wayland \
	wayland-native \
	wayland-protocols \
	vulkan-headers \
	vulkan-loader \
	virtual/egl \
	virtual/libgbm \
	virtual/libgles2 \
	xcb-util-wm \
"

SRC_URI = "git://gitlab.gnome.org/World/Phosh/phoc.git;protocol=https;nobranch=1;name=phoc;tag=v${PV}"
SRC_URI += "git://gitlab.gnome.org/GNOME/gvdb.git;protocol=https;subdir=${S}/subprojects/gvdb;name=gvdb;nobranch=1"
SRC_URI += "git://gitlab.freedesktop.org/wlroots/wlroots.git;protocol=https;subdir=${S}/subprojects/wlroots-0.20.x;name=wlroots;branch=0.20;tag=0.20.2"

SRCREV_phoc = "d50d76a4add49add71b259df9cf67d58b3cbddfb"
SRCREV_gvdb = "4758f6fb7f889e074e13df3f914328f3eecb1fd3"
SRCREV_wlroots = "d783533489e1f75d6886c2ab5c5960090ef268f8"
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

EXTRA_OEMESON += "-Dembed-wlroots=enabled -Dwlroots:default_library=static --buildtype=release"

do_patch[postfuncs] += "phoc_patch_wlroots"
phoc_patch_wlroots() {
	cd ${S}/subprojects/wlroots-0.20.x
	for p in ${S}/subprojects/packagefiles/wlroots/text-input-v2/*.patch ${S}/subprojects/packagefiles/wlroots/*.patch; do
		patch -p1 --no-backup-if-mismatch < $p
	done
}

do_install:append() {
	rm -rf ${D}${includedir}/wlroots-0.20 ${D}${libdir}/libwlroots-0.20.a ${D}${libdir}/pkgconfig/wlroots-0.20.pc
}

FILES:${PN} += "${datadir}"

