SUMMARY = "Day/night gamma adjustments for Wayland compositors supporting wlr-gamma-control-unstable-v1."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/wlsunset"
BUGTRACKER = "https://git.sr.ht/~kennylevinsen/wlsunset/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=715a99d2dd552e6188e74d4ed2914d5a"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
"

inherit meson pkgconfig features_check manpages

SRC_URI = "git://git.sr.ht/~kennylevinsen/wlsunset;protocol=https;nobranch=1"

PACKAGECONFIG[manpages] = ",,scdoc-native"



SRCREV = "634c8ebc53a31d4e5ed394f7950760deb5322102"

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

