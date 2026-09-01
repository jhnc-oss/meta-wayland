SUMMARY = "An xdg-desktop-portal backend for the Umbriel compositor"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca01f6fdf705a36f41b4e431ee0a4af0"

SRC_URI = "git://github.com/noctalia-dev/xdg-desktop-portal-umbriel.git;protocol=https;branch=main"
SRCREV = "d996f0c2bd4e8c868c0a143f0c9ce060f3c47ed5"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	sdbus-c++ \
	pipewire \
	wayland \
	wayland-protocols \
	wayland-native \
	libdrm \
	nlohmann-json \
	virtual/libgbm \
	cairo \
	tomlplusplus \
"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "picker"
PACKAGECONFIG[picker] = "-Dpicker=enabled,-Dpicker=disabled,gtk4"

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"
