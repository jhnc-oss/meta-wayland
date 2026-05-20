SUMMARY = "Lightweight notification daemon for wlroots-based Wayland compositors."
HOMEPAGE = "https://codeberg.org/dnkl/fnott"
BUGTRACKER = "https://codeberg.org/dnkl/fnott/issues"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://codeberg.org/dnkl/fnott.git;protocol=https;branch=releases/1.8 \
"

DEPENDS = " \
	dbus \
	fcft \
	libpng \
	pixman \
	scdoc-native \
	tllist \
	wayland \
	wayland-native \
	wayland-protocols \
"

inherit meson pkgconfig features_check

SRCREV = "700a5836cc1a626c9868a008bb9491d11b943bf5"

EXTRA_OEMESON += "--buildtype release"

PACKAGES += "${PN}-zsh-completion"
FILES:${PN} += "${datadir}/dbus-1 ${systemd_user_unitdir}"
FILES:${PN}-zsh-completion = "${datadir}/zsh ${datadir}/fish"

