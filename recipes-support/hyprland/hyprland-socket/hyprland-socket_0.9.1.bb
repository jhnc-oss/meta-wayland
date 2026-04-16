SUMMARY = "Typed Python library for Hyprland IPC via Unix sockets"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eaf6c29d9f87dd889ebdc68764a4e8d0"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-socket.git;protocol=https;nobranch=1"
SRCREV = "2b52e1b4b4dfada3ac1b9a579f6c5509a9eb4fd5"
