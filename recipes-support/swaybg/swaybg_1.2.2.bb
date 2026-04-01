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

SRCREV = "a59ea3dbe543b44177ad1b5bdb4afa1c5be9b9d2"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

