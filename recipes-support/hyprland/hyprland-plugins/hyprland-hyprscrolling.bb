SUMMARY = "A plugin to add scrolling layout"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

require hyprland-plugins.inc

DEPENDS = " \
    pixman \
    libdrm \
    hyprland \
    libinput \
    udev \
    pango \
    cairo \
    wayland-native \
    libxkbcommon \
"

S = "${WORKDIR}/git/hyprscrolling"

inherit meson pkgconfig

FILES:${PN} += "${libdir}/libhyprscrolling.so"
FILES:${PN}-dev = ""
