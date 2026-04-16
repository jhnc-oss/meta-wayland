SUMMARY = "A native GTK4/libadwaita settings app for Hyprland"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=818b1111623280b357eba3f8515d6cce"

DEPENDS += "glib-2.0-native"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprmod.git;protocol=https;nobranch=1"
SRCREV = "1afb12013d03a9fa0e7b34fbd239f3b459b03b73"

RDEPENDS:${PN} = " \
	gnome-desktop \
	gtk4 \
	hyprland-config \
	hyprland-socket \
	hyprland-events \
	hyprland-schema \
	hyprland-state \
	hyprland-monitors \
	libadwaita \
	python3-pygobject \
"
