SUMMARY = "Modular status panel for X11 and Wayland."
HOMEPAGE = "https://codeberg.org/dnkl/yambar"
BUGTRACKER = "https://codeberg.org/dnkl/yambar/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=00b01b6aa1e1a7130832b0178f8d7485"

SRC_URI = " \
	git://codeberg.org/dnkl/yambar.git;protocol=https;branch=master \
"

DEPENDS = " \
	bison-native \
	libyaml \
	fcft \
	tllist \
	pixman \
	json-c \
	alsa-lib \
	scdoc-native \
"

RRECOMMENDS:${PN} += " \
	font-awesome-otf \
"

inherit meson pkgconfig

S = "${WORKDIR}/git"
PV = "1.9.0"
SRCREV = "1353d635c211bf563c006a35c70c3e4d5db461a4"

PACKAGECONFIG[wayland] = "-Dbackend-wayland=enabled,-Dbackend-wayland=disabled,wayland wayland-native wayland-protocols"
PACKAGECONFIG[x11] = "-Dbackend-x11=enabled,-Dbackend-x11=disabled,xcb-util xcb-util-cursor xcb-util-wm libxcb"
PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,eudev"
PACKAGECONFIG[mpd] = "-Dplugin-mpd=enabled,-Dplugin-mpd=disabled,libmpdclient"
PACKAGECONFIG[shared-plugins] = "-Dcore-plugins-as-shared-libraries=true,-Dcore-plugins-as-shared-libraries=false"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'wayland', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
"

EXTRA_OEMESON += "--buildtype release"

PACKAGES += "${PN}-zsh-completion"
FILES:${PN}-zsh-completion = "${datadir}/zsh"

BBCLASSEXTEND = ""

