SUMMARY = "A plugin to add expo (overlay) for workspaces."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

SRC_URI = "git://github.com/sandwichfarm/hyprexpo.git;protocol=https;branch=master"
SRC_URI += "file://0001-CMakeLists.txt-dont-be-specific-about-required-lu.patch"
SRCREV = "219dd8e7b6b2dcb11b88421475bc5756a32b411e"

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
