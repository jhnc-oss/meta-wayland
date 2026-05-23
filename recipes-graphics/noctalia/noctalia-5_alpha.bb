SUMMARY = "A sleek, minimal, and thoughtfully crafted setup for Wayland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5bd433caa90a88d62bd293dabc90f4a3"


SRC_URI = "git://github.com/noctalia-dev/noctalia-shell.git;protocol=https;branch=v5"
SRC_URI += "file://0001-assets-buildpath.patch"
SRCREV = "a365a75c2a23fdeac3bfee2fcfc184db39407f11"

REQUIRED_DISTRO_FEATURES = "pam"

DEPENDS += " \
	sdbus-c++ \
	wayland \
	wayland-native \
	wayland-protocols \
	virtual/egl \
	virtual/libgles2 \
	freetype \
	cairo \
	fontconfig \
	pango \
	harfbuzz \
	librsvg \
	glib-2.0 \
	polkit \
	pipewire \
	libpam \
	curl \
"

inherit meson pkgconfig

PACKAGECONFIG ?= "${@bb.utils.contains('TCLIBC', 'glibc', 'jemalloc', '', d)}"
PACKAGECONFIG[jemalloc] = "-Djemalloc=enabled,-Djemalloc=disabled,jemalloc"

FILES:${PN} += "${datadir}"

