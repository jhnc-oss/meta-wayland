SUMMARY = "Live state interface for Hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c62263f865258675e882916b0e77279a"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-state.git;protocol=https;nobranch=1"
SRCREV = "737c5a50c53fa3b8ebd24dbddc6737f9e68c318b"

RDEPENDS:${PN} = "hyprland-config hyprland-socket hyprland-schema hyprland-monitors"
