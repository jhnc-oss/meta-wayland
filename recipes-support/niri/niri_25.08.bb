SUMMARY = "A scrollable-tiling Wayland compositor"
HOMEPAGE = "https://github.com/YaLTeR/niri"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5b4473596678d62d9d83096273422c8c"

SRC_URI += " git://github.com/YaLTeR/niri.git;protocol=https;branch=main;lfs=0"
SRCREV = "8c8447918f4fd7bc6c86a8622b1db52417fbbbbd"

DEPENDS = " \
	cairo \
	clang-native \
	dbus \
	virtual/libgl \
	libdisplay-info \
	libinput \
	libxkbcommon \
	virtual/libgbm \
	pango \
	pipewire \
	seatd \
	wayland \
	wayland-native \
	wayland-protocols \
"

PV:append = "+git"

inherit cargo pkgconfig cargo-update-recipe-crates

require ${PN}-crates.inc

export LIBCLANG_PATH = "${STAGING_LIBDIR_NATIVE}/libclang.so"

# smithay is fetched at do_compile
CARGO_BUILD_FLAGS:remove = "--frozen"
do_compile[network] = "1"

# avoid packaging the debug symbols as they contain buildpaths (cargo_home)
PACKAGES:remove = "${PN}-dbg"
INSANE_SKIP:${PN} = "installed-vs-shipped"
