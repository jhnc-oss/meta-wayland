SUMMARY = "Typed Python library for Hyprland IPC via Unix sockets"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eaf6c29d9f87dd889ebdc68764a4e8d0"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-socket.git;protocol=https;nobranch=1"
SRCREV = "c206c25cbbc8825a81503a39363daed9902a3888"
