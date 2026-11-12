SUMMARY = "Umbriel is a Wayland compositor designed for daily use"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca01f6fdf705a36f41b4e431ee0a4af0"

SRC_URI = "git://github.com/noctalia-dev/umbriel.git;protocol=https;branch=main"
SRC_URI += " \
	file://0001-fix-crosscompile.patch \
	file://0002-fix-view-keep-the-anchored-edges-of-a-float-when-the.patch \
"
SRCREV = "0c1f125536f19dc62bcf277840bc503a1c756abf"

REQUIRED_DISTRO_FEATURES = "wayland x11"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
	wlroots-0.20 \
	libxkbcommon \
	libinput \
	pixman \
	tomlplusplus \
	nlohmann-json \
	cairo \
	pango \
	libdrm \
	libdisplay-info \
	libxcb \
	xcb-util-wm \
	tomlplusplus \
"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= " \
	${@bb.utils.contains('TCLIBC', 'glibc', 'jemalloc', '', d)} \
	lcms2 \
"
PACKAGECONFIG[jemalloc] = "-Djemalloc=enabled,-Djemalloc=disabled,jemalloc"
PACKAGECONFIG[lcms2] = "-Dlcms2=enabled,-Dlcms2=disabled,lcms"

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"

RRECOMMENDS:${PN} ?= "xdg-desktop-portal-umbriel"
