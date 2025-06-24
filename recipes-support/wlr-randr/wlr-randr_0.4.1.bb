SUMMARY = "Utility to manage outputs of a Wayland compositor."
HOMEPAGE = "https://sr.ht/~emersion/wlr-randr/"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=07e8a8f2dc9e6a7f131e81037398c61b"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "git://git.sr.ht/~emersion/wlr-randr;protocol=https;nobranch=1"

inherit meson pkgconfig

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
"

inherit meson pkgconfig features_check

SRCREV = "2277ca73f03cf2970cb8f5c47e8c58315ba00efa"
