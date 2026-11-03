SUMMARY = "A plugin to add expo (overlay) for workspaces."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

SRC_URI = "git://github.com/sandwichfarm/hyprexpo.git;protocol=https;branch=master;tag=v${PV}"
SRCREV = "3ec4d82e52f0d4765b87f6ef14f1883a44e85e27"

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
