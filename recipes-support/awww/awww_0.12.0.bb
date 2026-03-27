SUMMARY = "A Solution to your Wayland Wallpaper Woes"
HOMEPAGE = "https://codeberg.org/LGFae/awww"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit cargo pkgconfig cargo-update-recipe-crates

require ${PN}-crates.inc

DEPENDS += "lz4 wayland-protocols wayland wayland-native"

SRCREV = "7a8fc2e646b97e5ae508a44d3449e3b41345d456"

SRC_URI += "git://codeberg.org/LGFae/awww.git;protocol=https;branch=main"

do_configure:prepend() {
    sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}
