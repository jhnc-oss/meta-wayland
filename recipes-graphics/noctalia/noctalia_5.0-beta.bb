SUMMARY = "A lightweight Wayland shell and bar built directly on Wayland + OpenGL ES, with no Qt or GTK dependency"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5bd433caa90a88d62bd293dabc90f4a3"

SRC_URI = "git://github.com/noctalia-dev/noctalia.git;protocol=https;branch=main"
SRC_URI += "file://0001-assets-buildpath.patch"
SRCREV = "4c2dcd0995f9c570c0ced95561bf5e4685e2ad1b"

REQUIRED_DISTRO_FEATURES = "opengl pam polkit pipewire"

DEPENDS += " \
	sdbus-c++ \
	wayland \
	wayland-native \
	wayland-protocols \
	freetype \
	cairo \
	fontconfig \
	glib-2.0 \
	pango \
	harfbuzz \
	librsvg \
	libxkbcommon \
	libxml2 \
	libqalculate \
	libsodium \
	libsecret \
	md4c \
	nlohmann-json \
	polkit \
	pipewire \
	wireplumber \
	libpam \
	curl \
	libwebp \
	stb \
	tomlplusplus \
	${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'virtual/egl virtual/libgles2', 'epoxy', d)} \
"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "${@bb.utils.contains('TCLIBC', 'glibc', 'jemalloc', '', d)}"
PACKAGECONFIG[jemalloc] = "-Djemalloc=enabled,-Djemalloc=disabled,jemalloc"

FILES:${PN} += "${datadir}"

RRECOMMENDS:${PN} ?= " \
	app2unit \
	bash \
	bluez5 \
	brightnessctl \
	cava \
	cliphist \
	coreutils \
	ddcutil \
	fastfetch \
	file \
	findutils \
	libnotify \
	gpu-screen-recorder \
	networkmanager \
	playerctl \
	power-profiles-daemon \
	wlsunset \
"
