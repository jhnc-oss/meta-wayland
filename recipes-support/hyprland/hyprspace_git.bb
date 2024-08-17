SUMMARY = "A plugin for Hyprland that implements a workspace overview feature similar to that of KDE Plasma, GNOME and macOS"
HOMEPAGE = "https://hyprland.org/"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/clague/Hyprspace.git;protocol=https;branch=main"

SRCREV = "6ac35435eebb466e1630f573e2c97344c2848353"
S = "${WORKDIR}/git"

DEPENDS += " \
	libdrm \
	pixman  \
	hyprland \
	hyprutils \
"

REQUIRED_DISTRO_FEATURES = "wayland"

inherit meson pkgconfig features_check

FILES:${PN} += "${libdir}/libHyprspace.so"
FILES:${PN}-dev = ""
