SUMMARY = "Cage: a Wayland kiosk"
DESCRIPTION = "\
    Cage is a compositor (window manager) that displays a single maximized \
    application at a time and prevents the user from interacting with anything \
    but this application. As such, user input such as moving, resizing, \
    minimizing and unmaximizing windows is ignored. \
"
HOMEPAGE = "https://www.hjdskes.nl/projects/cage/"
BUGTRACKER = "https://github.com/cage-kiosk/cage/issues"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3d06ce025701c9a0b391f15902ce8ed"

DEPENDS = "\
    libxkbcommon \
    pixman \
    wayland \
    wayland-native \
    wayland-protocols \
"

inherit meson pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "git://github.com/cage-kiosk/cage;branch=master;protocol=https"
S = "${UNPACKDIR}/git"
