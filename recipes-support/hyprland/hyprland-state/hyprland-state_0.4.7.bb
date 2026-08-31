SUMMARY = "Live state interface for Hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c62263f865258675e882916b0e77279a"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-state.git;protocol=https;nobranch=1"
SRCREV = "024b951f37f7574d204113dac93f7797c8629dd4"

RDEPENDS:${PN} = "hyprland-config hyprland-socket hyprland-schema hyprland-monitors"
