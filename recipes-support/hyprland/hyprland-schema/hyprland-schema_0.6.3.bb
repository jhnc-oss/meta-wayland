SUMMARY = "Typed Python schema for every Hyprland configuration option"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eaf6c29d9f87dd889ebdc68764a4e8d0"

inherit python_hatchling

SRC_URI += "git://github.com/BlueManCZ/hyprland-schema.git;protocol=https;nobranch=1"
SRCREV = "4598eb88f6d09c112e717cd83b6471a0fc3def14"
