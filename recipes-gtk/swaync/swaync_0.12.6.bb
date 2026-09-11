SUMMARY = "A simple notification daemon with a GTK gui for notifications and the control center."
HOMEPAGE = "https://github.com/ErikReider/SwayNotificationCenter"
BUGTRACKER = "github.com/ErikReider/SwayNotificationCenter"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"


DEPENDS = " \
            gtk4 \
            gtk4-layer-shell \
            libadwaita \
            granite \
            json-glib \
            libgee \
            pulseaudio \
            wayland \
            sassc-native \
            wayland-native \
            blueprint-compiler-native \
"

SRC_URI = " \
	git://github.com/ErikReider/SwayNotificationCenter.git;protocol=https;nobranch=1;tag=v0.12.6 \
"

SRCREV = "1043ef98ec97a27e24192a726576fce807d2ee49"

inherit meson pkgconfig vala manpages

export GI_TYPELIB_PATH = "${STAGING_LIBDIR}/girepository-1.0/"

VALA_MESON_OPTION = ""

EXTRA_OEMESON += "--buildtype release"

PACKAGECONFIG[bash] = "-Dbash-completions=true,-Dbash-completions=false"
PACKAGECONFIG[fish] = "-Dfish-completions=true,-Dfish-completions=false"
PACKAGECONFIG[manpages] = "-Dman-pages=true,-Dman-pages=false,scdoc-native"
PACKAGECONFIG[scripting] = "-Dscripting=true,-Dscripting=false"
PACKAGECONFIG[systemd] = "-Dsystemd-service=true,-Dsystemd-service=false"
PACKAGECONFIG[zsh] = "-Dzsh-completions=true,-Dzsh-completions=false"

PACKAGECONFIG ?= "bash"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

