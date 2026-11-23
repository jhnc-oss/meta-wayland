SUMMARY = "Plain text editor for Wayland in the style of the Noctalia desktop"
HOMEPAGE = "https://github.com/MarkusVolk/plume"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=5cea96956976339e8b0ee437ca04d69f \
	file://lib/assets/fonts/tabler-icons-license.txt;md5=ed422355f685d767a7c19898a8afa7d9 \
"

SRC_URI = "git://github.com/MarkusVolk/plume.git;protocol=https;branch=main"
SRCREV = "fff0c619fabfdfd4ac649d8447d74f5fd019c4c5"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
	virtual/egl \
	virtual/libgles2 \
	glib-2.0 \
	libtreesitter \
	freetype \
	fontconfig \
	cairo \
	pango \
	harfbuzz \
	libxkbcommon \
	stb \
	tomlplusplus \
	nlohmann-json \
"

inherit meson pkgconfig features_check mime mime-xdg

EXTRA_OEMESON += " \
	-Dtests=disabled \
	-Dbuild_revision=${SRCREV} \
"

FILES:${PN} += " \
	${datadir}/plume \
	${datadir}/licenses \
	${datadir}/icons \
	${datadir}/mime \
"

RRECOMMENDS:${PN} += " \
	xdg-desktop-portal \
	glibc-gconv-utf-16 \
"
