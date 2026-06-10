SUMMARY = "Typed Python library for Hyprland IPC via Unix sockets"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eaf6c29d9f87dd889ebdc68764a4e8d0"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-socket.git;protocol=https;nobranch=1"
SRCREV = "74fd436f5e58fe5a4c06525be0aeadaa5fe48ee1"
