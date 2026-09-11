SUMMARY = "wallust - Generate colors from an image"
HOMEPAGE = "https://codeberg.org/explosion-mental/wallust"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77343652fd2b1c59f2130b40d0391ecf"

SRC_URI += "git://codeberg.org/explosion-mental/wallust.git;protocol=https;nobranch=1;tag=3.5.2"
SRCREV = "b689616d630bb2e541695f101d313699464aac09"

inherit cargo cargo-update-recipe-crates

oe_cargo_fix_env:append() {
	export LIBGIT2_NO_VENDOR="0"
}

require ${PN}-crates.inc

do_configure:prepend() {
	sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}
