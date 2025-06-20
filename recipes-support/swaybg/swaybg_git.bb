SUMMARY = "swaybg is a wallpaper utility for Wayland compositors."
HOMEPAGE = "https://github.com/swaywm/swaybg"
BUGTRACKER = "https://github.com/swaywm/swaybg/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b53d9ec16b9125995437ac9efab1b450"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS = " \
            cairo \
            gdk-pixbuf \
            wayland \
            wayland-native \
            wayland-protocols \
"

SRC_URI = "git://github.com/swaywm/swaybg.git;protocol=https;branch=master"

PV = "1.2.1"
SRCREV = "1a70f3ab566f6d939a1e342158e830a38dfe31ac"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

