SUMMARY = "Fix for CS:GO with -vulkan."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

SRC_URI = " \
	git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main \
"

DEPENDS = " \
    pixman \
    libdrm \
    hyprland \
"

S = "${WORKDIR}/git/csgo-vulkan-fix"
SRCREV = "b378b7baa66e0ba1f7cc5c00505cca252f53f420"

inherit meson pkgconfig

FILES:${PN} += "${libdir}/libcsgo-vulkan-fix.so"
FILES:${PN}-dev = ""
