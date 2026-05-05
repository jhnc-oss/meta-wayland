SUMMARY = "A native, blazing-fast screenshot tool for wlroots based compositors"
HOMEPAGE = "https://github.com/waycrate/wayshot"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7e757c7459a738c61b5a5834681d4297"

SRC_URI += "git://github.com/waycrate/wayshot.git;protocol=https;nobranch=1"
SRCREV = "d77da2cd34ac593d263a45c18326390fcc6191aa"

DEPENDS = "libjxl libwebp libavif libjpeg-turbo virtual/egl wayland"

require wayshot-crates.inc

inherit cargo pkgconfig cargo-update-recipe-crates
