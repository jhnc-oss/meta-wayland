SUMMARY = "A Solution to your Wayland Wallpaper Woes"
HOMEPAGE = "https://github.com/LGFae/swww"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit cargo pkgconfig cargo-update-recipe-crates

require ${PN}-crates.inc

DEPENDS += "lz4 wayland-protocols wayland wayland-native"

SRCREV = "a2864804e48533f4c70c63930d8cb24b394288ec"

SRC_URI += "git://github.com/LGFae/swww.git;protocol=https;branch=main"

do_configure:prepend() {
    sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}
