SUMMARY = "swaylock is a screen locking utility for Wayland compositors."
HOMEPAGE = "https://github.com/swaywm/swaylock"
BUGTRACKER = "https://github.com/swaywm/swaylock/issues"
SECTION = "base/wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b53d9ec16b9125995437ac9efab1b450"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS = " \
            cairo \
            libxkbcommon \
            wayland \
            wayland-native \
            wayland-protocols \
"

inherit meson pkgconfig features_check manpages

SRC_URI = " \
	git://github.com/swaywm/swaylock.git;protocol=https;branch=master \
"

SRCREV = "bd2dfec9ae0111b1858d5fab44f0f4fac4117d07"

PACKAGECONFIG[pam] = ",,libpam"
PACKAGECONFIG[gdk-pixbuf] = ",,gdk-pixbuf"
PACKAGECONFIG[manpages] = ",,scdoc-native"

PACKAGECONFIG ?= " \
	gdk-pixbuf \
	pam \
"

# Reproducibility issue. Fix me!
CFLAGS:append = " -Wno-error=date-time"

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

