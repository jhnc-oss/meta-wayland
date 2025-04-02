SUMMARY = "kanshi allows you to define output profiles that are automatically enabled and disabled on hotplug."
HOMEPAGE = "https://git.sr.ht/~emersion/kanshi"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=706cd9899438a9385250ab6773c1fa53"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://git.sr.ht/~emersion/kanshi;protocol=https;branch=master \
"

DEPENDS = "wayland wayland-native libscfg"

inherit meson pkgconfig features_check manpages

PACKAGECONFIG[ipc] = "-Dipc=enabled,-Dipc=disabled,libvarlink"
PACKAGECONFIG[manpages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"

PACKAGECONFIG ?= " \
	ipc \
"

S = "${WORKDIR}/git"
PV = "1.7.0"
SRCREV = "83dc2fd4ff28ba77b5729ab89fc1b8ea3b3e2882"

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

