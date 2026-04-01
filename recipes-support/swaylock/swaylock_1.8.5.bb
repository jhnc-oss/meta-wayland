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

SRCREV = "1a4c472c11ee0354e5a689e33fad4ecce533ddc3"

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

