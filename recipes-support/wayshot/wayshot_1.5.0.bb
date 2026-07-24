SUMMARY = "A native, blazing-fast screenshot tool for wlroots based compositors"
HOMEPAGE = "https://github.com/waycrate/wayshot"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE-BSD;md5=3611f6bcddb6e657a1d5267710ad0760"

SRC_URI += "git://github.com/waycrate/wayshot.git;protocol=https;nobranch=1"
SRCREV = "100dff71d690749715861228e6adcda8dede4190"

DEPENDS = "cairo pango libjxl libwebp libavif libjpeg-turbo virtual/libgbm virtual/egl wayland"

require wayshot-crates.inc

inherit cargo pkgconfig cargo-update-recipe-crates
