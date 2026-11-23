SUMMARY = "A native, blazing-fast screenshot tool for wlroots based compositors"
HOMEPAGE = "https://github.com/waycrate/wayshot"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE-BSD;md5=3611f6bcddb6e657a1d5267710ad0760"

SRC_URI += "git://github.com/waycrate/wayshot.git;protocol=https;nobranch=1;tag=v${PV}-wayshot"
SRCREV = "a2c10049a325b51989536d784ea5d084f88e3238"

DEPENDS = "cairo pango libjxl libwebp libavif libjpeg-turbo virtual/libgbm virtual/egl wayland"

require wayshot-crates.inc

inherit cargo pkgconfig cargo-update-recipe-crates

do_configure:prepend() {
	sed -i '/^name = "wayshot"$/{n;s/1.7.0/${PV}/}' ${S}/Cargo.lock
}
