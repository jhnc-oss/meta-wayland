SUMMARY = "Umbriel is a Wayland compositor designed for daily use"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca01f6fdf705a36f41b4e431ee0a4af0"

SRC_URI = "git://github.com/noctalia-dev/umbriel.git;protocol=https;branch=main"
SRC_URI += "file://0001-fix-crosscompile.patch"
SRCREV = "293724d3a81847ad4ff4214611c426316d7f45d9"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
	wlroots-0.20 \
	libxkbcommon \
	libinput \
	pixman \
	tomlplusplus \
	nlohmann-json \
	cairo \
	pango \
	libdrm \
	tomlplusplus \
"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "${@bb.utils.contains('TCLIBC', 'glibc', 'jemalloc', '', d)}"
PACKAGECONFIG[jemalloc] = "-Djemalloc=enabled,-Djemalloc=disabled,jemalloc"

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"

RRECOMMENDS:${PN} ?= "xdg-desktop-portal-umbriel"
