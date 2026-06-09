SUMMARY = "A plugin to add expo (overlay) for workspaces."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

SRC_URI = "git://github.com/sandwichfarm/hyprexpo.git;protocol=https;branch=master"
SRCREV = "3c2b977d0e4ea6529d9e429e6c43786fdb09e00a"

DEPENDS = " \
    pixman \
    libdrm \
    hyprland \
    libinput \
    lua \
    udev \
    pango \
    cairo \
    wayland-native \
    libxkbcommon \
    hyprutils \
"

inherit cmake pkgconfig

FILES:${PN} = "${libdir}/libhyprexpo.so"
FILES:${PN}-dev = ""
