SUMMARY = "kanshi allows you to define output profiles that are automatically enabled and disabled on hotplug."
HOMEPAGE = "https://git.sr.ht/~emersion/kanshi"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=706cd9899438a9385250ab6773c1fa53"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "git://gitlab.freedesktop.org/emersion/kanshi;protocol=https;branch=master;tag=v1.9.0"

DEPENDS = "wayland wayland-native libscfg"

inherit meson pkgconfig features_check manpages

PACKAGECONFIG[ipc] = "-Dipc=enabled,-Dipc=disabled,vali vali-native"
PACKAGECONFIG[manpages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"

PACKAGECONFIG ?= " \
	ipc \
"

SRCREV = "424f454329ec48f7f078b9225a6e3c7b7d8185ae"

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

