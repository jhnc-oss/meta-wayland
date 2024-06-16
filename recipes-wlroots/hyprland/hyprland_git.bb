SUMMARY = "A Wayland WM"
HOMEPAGE = "https://hyprland.org/"
SECTION = "graphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e5285450935e9c47f839569c8cbd4e29"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	cairo \
	hyprcursor \
	hyprlang \
	jq-native \
	hwdata-native \
	libdisplay-info \
	libliftoff \
	libdrm \
	libinput \
	libxkbcommon \
	pango \
	pixman \
	seatd \
	tomlplusplus \
	util-linux-libuuid \
	virtual/egl \
	wayland \
	wayland-native \
	xcb-util-errors \
	hyprwayland-scanner-native \
"

RRECOMMENDS:${PN} ?= " \
	foot \
	jq \
	grim \
	slurp \
	wl-clipboard \
	hyprland-contrib \
"

SRC_URI = "gitsm://github.com/hyprwm/Hyprland.git;protocol=https;branch=main"

SRCREV = "2031af82fa029aa098357339d502b53c371919d4"
PV = "0.41.1"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd xwayland', d)}"

PACKAGECONFIG[systemd] = "-Dsystemd=enabled,-Dsystemd=disabled"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm xcb-util-renderutil xwayland,xwayland"
PACKAGECONFIG[legacy_renderer] = "-Dlegacy_renderer=enabled,-Dlegacy_renderer=disabled"

do_configure:prepend() {
	cd ${S} && scripts/generateVersion.sh
}

FILES:${PN} += "${datadir}"

