SUMMARY = "Typed event dispatch layer for Hyprland IPC. Built on top of hyprland-socket"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eaf6c29d9f87dd889ebdc68764a4e8d0"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-events.git;protocol=https;nobranch=1"
SRCREV = "ca63cd28bee8d5090bbe9586318e52207ffcced3"

RDEPENDS:${PN} = "hyprland-socket"
