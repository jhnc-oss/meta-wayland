SUMMARY = "A plugin for Hyprland that implements a workspace overview feature similar to that of KDE Plasma, GNOME and macOS"
HOMEPAGE = "https://github.com/KZDKM/Hyprspace"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = " \
	git://github.com/KZDKM/Hyprspace.git;protocol=https;branch=main \
"

SRCREV = "c3cf91bdb6a912f9d2c2779deebdf23385fd659a"
S = "${WORKDIR}/git"

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
