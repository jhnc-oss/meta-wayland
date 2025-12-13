SUMMARY = "Yazi - Blazing Fast Terminal File Manager"
HOMEPAGE = "https://github.com/sxyazi/yazi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c0ba340a238122a2eb7974c71bf7ae4"

SRC_URI = "git://github.com/sxyazi/yazi.git;protocol=https;branch=main"
SRC_URI += "file://0001-Cargo.toml-disable-strip.patch"
SRCREV = "b65a88075a824e4304dca5428ba05de1404fa635"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc

# avoid packaging the debug symbols as they contain buildpaths (cargo_home)
PACKAGES:remove = "${PN}-dbg"
INSANE_SKIP:${PN} = "installed-vs-shipped"
