SUMMARY = "A plugin for Hyprland that implements a workspace overview feature similar to that of KDE Plasma, GNOME and macOS"
HOMEPAGE = "https://github.com/KZDKM/Hyprspace"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = " \
	git://github.com/KZDKM/Hyprspace.git;protocol=https;branch=main \
"

SRCREV = "0a82e3724f929de8ad8fb04d2b7fa128493f24f7"

DEPENDS += " \
	libdrm \
	pixman  \
	hyprland \
	hyprutils \
"

REQUIRED_DISTRO_FEATURES = "wayland"

inherit meson pkgconfig features_check

# Hack to allow patching the plugins
do_configure:prepend() {
	rm -rf ${S}/patches
	rm -rf ${S}/.pc
}

FILES:${PN} += "${libdir}/libHyprspace.so"
FILES:${PN}-dev = ""
