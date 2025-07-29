SUMMARY = "A GTK3-based panel for wayfire"
HOMEPAGE = "https://github.com/WayfireWM/wf-shell"
BUGTRACKER = "https://github.com/WayfireWM/wf-shell/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=36b5a4f8bf9f782fbab2099fdeb44369"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	wayfire \
	gtkmm3 \
	gtk-layer-shell \
	pulseaudio \
	libnotify3 \
	libdbusmenu-gtk \
"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "gitsm://github.com/WayfireWM/wf-shell.git;protocol=https;nobranch=1"
SRCREV = "aaadead17cfbb98c64cb7f76fb339dc3485aca7c"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

