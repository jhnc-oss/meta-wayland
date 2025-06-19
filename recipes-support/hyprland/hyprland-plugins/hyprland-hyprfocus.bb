SUMMARY = "Flashfocus for Hyprland"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

require hyprland-plugins.inc

S = "${WORKDIR}/git/hyprfocus"

FILES:${PN} += "${libdir}/libhyprfocus.so"

