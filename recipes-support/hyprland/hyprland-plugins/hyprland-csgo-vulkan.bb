SUMMARY = "Fix for CS:GO with -vulkan."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

require hyprland-plugins.inc

S = "${UNPACKDIR}/${BB_GIT_DEFAULT_DESTSUFFIX}/csgo-vulkan-fix"

FILES:${PN} += "${libdir}/libcsgo-vulkan-fix.so"

