SUMMARY = "Live state interface for Hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c62263f865258675e882916b0e77279a"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-state.git;protocol=https;nobranch=1;tag=v${PV}"
SRCREV = "368cbbfd2dff4b659835acc2a52e97ec30bcf67a"

RDEPENDS:${PN} = "hyprland-config hyprland-socket hyprland-schema hyprland-monitors"
