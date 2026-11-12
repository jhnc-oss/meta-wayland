SUMMARY = "An xdg-desktop-portal backend for the Umbriel compositor"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca01f6fdf705a36f41b4e431ee0a4af0"

SRC_URI = "git://github.com/noctalia-dev/xdg-desktop-portal-umbriel.git;protocol=https;branch=main"
SRCREV = "56951426eb9931db3f1c57348f226c2427fba4f3"

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

PACKAGECONFIG ?= "picker"
PACKAGECONFIG[picker] = "-Dpicker=enabled,-Dpicker=disabled,gtk4"

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"
