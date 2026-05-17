SUMMARY = "Monitor management utilities for Hyprland. Built on top of hyprland-socket"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eaf6c29d9f87dd889ebdc68764a4e8d0"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-monitors.git;protocol=https;nobranch=1"
SRCREV = "78056fb018a7e01227a785ca0d8d9f20adc15771"

RDEPENDS:${PN} = "hyprland-socket"
