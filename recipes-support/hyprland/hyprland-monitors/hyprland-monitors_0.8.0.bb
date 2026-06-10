SUMMARY = "Monitor management utilities for Hyprland. Built on top of hyprland-socket"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eaf6c29d9f87dd889ebdc68764a4e8d0"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-monitors.git;protocol=https;nobranch=1"
SRCREV = "88fc02edb14ec79fbf98ae34d8129da65ef65012"

RDEPENDS:${PN} = "hyprland-socket"
