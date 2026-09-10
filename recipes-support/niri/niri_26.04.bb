SUMMARY = "A scrollable-tiling Wayland compositor"
HOMEPAGE = "https://github.com/YaLTeR/niri"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5b4473596678d62d9d83096273422c8c"

SRC_URI += " \
	git://github.com/YaLTeR/niri.git;protocol=https;branch=main;lfs=0;tag=v26.04 \
	git://github.com/Smithay/smithay.git;protocol=https;nobranch=1;name=smithay;destsuffix=smithay;type=git-dependency \
	git://github.com/Smithay/smithay.git;protocol=https;nobranch=1;name=smithay-drm-extras;destsuffix=smithay/smithay-drm-extras;subpath=smithay-drm-extras;type=git-dependency \
"
SRCREV = "8ed0da44d974c32c6877d2f4630c314da0717ecb"
SRCREV_smithay = "ff5fa7df392cecfba049ffed55cdaa4e98a8e7ef"
SRCREV_smithay-drm-extras = "ff5fa7df392cecfba049ffed55cdaa4e98a8e7ef"
SRCREV_FORMAT = "default_smithay_smithay-drm-extras"

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
export CLANG_PATH = "${STAGING_BINDIR_NATIVE}/clang"
export BINDGEN_EXTRA_CLANG_ARGS = "${HOST_CC_ARCH} ${TOOLCHAIN_OPTIONS} --target=${TARGET_SYS}"

PACKAGECONFIG ?= ""
PACKAGECONFIG[xwayland] = ",,,xwayland-satellite"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

do_install:append() {
	install -d ${D}${datadir}/xdg-desktop-portal ${D}${datadir}/wayland-sessions
	install -m0644 ${S}/resources/niri.desktop ${D}${datadir}/wayland-sessions
	install -m0644 ${S}/resources/niri-portals.conf ${D}${datadir}/xdg-desktop-portal
	install -m0755 ${S}/resources/niri-session ${D}${bindir}
}

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} += "xwayland-satellite xdg-desktop-portal-gnome xdg-desktop-portal-gtk"
