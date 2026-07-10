SUMMARY = "Round-trip parser and editor for Hyprland configuration files"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eaf6c29d9f87dd889ebdc68764a4e8d0"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-config.git;protocol=https;nobranch=1"
SRCREV = "0e9f4b2131ceb61f4e1d04a857252403b708e5a0"
