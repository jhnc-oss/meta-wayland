SUMMARY = "Hot corners for Wayland."
HOMEPAGE = "https://github.com/AndreasBackx/waycorner"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02c8272ed81661567b3ff2d0be6e20f5"

SRC_URI += "git://github.com/AndreasBackx/waycorner.git;protocol=https;nobranch=1;branch=main"
SRCREV = "b462a5710f3d8238d8b14268001fd89a2f67fa30"
PV = "0.2.3"

require waycorner-crates.inc

inherit cargo pkgconfig cargo-update-recipe-crates
