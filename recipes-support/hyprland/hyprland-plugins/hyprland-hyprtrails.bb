SUMMARY = "A neat, but useless plugin to add trails behind windows."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

require hyprland-plugins.inc

S = "${UNPACKDIR}/${BP}/hyprtrails"

FILES:${PN} += "${libdir}/libhyprtrails.so"

