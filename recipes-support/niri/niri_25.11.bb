SUMMARY = "A scrollable-tiling Wayland compositor"
HOMEPAGE = "https://github.com/YaLTeR/niri"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5b4473596678d62d9d83096273422c8c"

SRC_URI += " git://github.com/YaLTeR/niri.git;protocol=https;branch=main;lfs=0"
SRCREV = "b35bcae35b3f9665043c335e55ed5828af77db85"

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

inherit cargo pkgconfig cargo-update-recipe-crates

require ${PN}-crates.inc

export LIBCLANG_PATH = "${STAGING_LIBDIR_NATIVE}/libclang.so"

# smithay is fetched at do_compile
CARGO_BUILD_FLAGS:remove = "--frozen"
do_compile[network] = "1"

# avoid packaging the debug symbols as they contain buildpaths (cargo_home)
PACKAGES:remove = "${PN}-dbg"
INSANE_SKIP:${PN} = "installed-vs-shipped"
