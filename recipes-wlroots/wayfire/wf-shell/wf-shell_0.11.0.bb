SUMMARY = "A GTK3-based panel for wayfire"
HOMEPAGE = "https://github.com/WayfireWM/wf-shell"
BUGTRACKER = "https://github.com/WayfireWM/wf-shell/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=36b5a4f8bf9f782fbab2099fdeb44369"

DEPENDS = " \
	gtk4-layer-shell \
	gtkmm4 \
	libdbusmenu-glib \
	libdrm \
	libepoxy \
	libpam \
	libxkbcommon \
	openssl \
	virtual/libgbm \
	wayfire \
	wayland \
	wayland-native \
	wayland-protocols \
	wf-config \
"

PACKAGECONFIG ?= "volume-widget wp-mixer-widget"
PACKAGECONFIG[volume-widget] = "-Dvolume-widget=enabled,-Dvolume-widget=disabled,pulseaudio"
PACKAGECONFIG[wp-mixer-widget] = "-Dwp-mixer-widget=enabled,-Dwp-mixer-widget=disabled,pipewire wireplumber"
PACKAGECONFIG[ddcutil] = "-Dddcutil=enabled,-Dddcutil=disabled,ddcutil"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "gitsm://github.com/WayfireWM/wf-shell.git;protocol=https;nobranch=1;tag=v0.11.0"
SRCREV = "881ef973039f239dc0a3ec8a547201a89b0eef8a"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

