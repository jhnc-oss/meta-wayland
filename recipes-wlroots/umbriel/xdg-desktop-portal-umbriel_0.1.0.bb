SUMMARY = "An xdg-desktop-portal backend for the Umbriel compositor"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca01f6fdf705a36f41b4e431ee0a4af0"

SRC_URI = "git://github.com/noctalia-dev/xdg-desktop-portal-umbriel.git;protocol=https;branch=main"
SRC_URI += "file://0001-build-prefix-the-GLib-isystem-path-with-the-cross-sys_root.patch"
SRCREV = "e81fb92f6d7bda38ab249d391d1ea48469047fff"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	sdbus-c++ \
	pipewire \
	wayland \
	wayland-protocols \
	wayland-native \
	libdrm \
	libei \
	nlohmann-json \
	virtual/libgbm \
	cairo \
	tomlplusplus \
"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "-Dtests=false"

PACKAGECONFIG ?= "picker"
PACKAGECONFIG[picker] = "-Dpicker=true,-Dpicker=false,virtual/egl virtual/libgles2 freetype fontconfig pango harfbuzz libxkbcommon glib-2.0 stb"

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"
