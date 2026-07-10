SUMMARY = "A native GTK4/libadwaita settings app for Hyprland"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=818b1111623280b357eba3f8515d6cce"

DEPENDS += "glib-2.0-native"

inherit python_hatchling gtk-icon-cache

SRC_URI += "git://github.com/BlueManCZ/hyprmod.git;protocol=https;nobranch=1"
SRCREV = "7480b39adbd14da89fca54e4fc68ea397b081f44"

do_install:append() {
	mkdir -p ${D}${datadir}
	for dir in applications metainfo icons; do
		cp -rf data/$dir ${D}${datadir}
	done
}

FILES:${PN} += "${datadir}"

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
