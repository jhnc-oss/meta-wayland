SUMMARY = "Round-trip parser and editor for Hyprland configuration files"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eaf6c29d9f87dd889ebdc68764a4e8d0"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-config.git;protocol=https;nobranch=1"
SRCREV = "484e0a0e46c601dcbf5a36355ae7712c5ee15ac8"
