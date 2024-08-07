SUMMARY = "Blazingly fast and efficient status bar + widgets written for gtk3"
HOMEPAGE = "https://github.com/scorpion-26/gBar"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=15efb84d5f4a09189d30d2682a2373ec"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "git://github.com/scorpion-26/gBar.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
SRCREV = "b1e2c2ed26a62058c502db3a03ac615f2567942e"

DEPENDS += " \
	gtk+3 \
	gtk-layer-shell \
	pulseaudio \
	wayland \
	wayland-native \
	wayland-protocols \
"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "sassc ${@bb.utils.filter('DISTRO_FEATURES', 'bluetooth', d)}"
PACKAGECONFIG[bluetooth] = "-DWithBlueZ=true,-DWithBlueZ=false,bluez5"
PACKAGECONFIG[dbusmenu] = "-DWithSNI=true,-DWithSNI=false,libdbusmenu"
PACKAGECONFIG[sassc] = "-DWithLibSass=true,-DWithLibSass=false,sassc"

FILES:${PN} += "${datadir}"
