SUMMARY = "wallust - Generate colors from an image"
HOMEPAGE = "https://codeberg.org/explosion-mental/wallust"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77343652fd2b1c59f2130b40d0391ecf"

SRC_URI += "git://codeberg.org/explosion-mental/wallust.git;protocol=https;nobranch=1;tag=3.4.0"
SRCREV = "3f557fe3f1c596f52fadf737f772111649a40080"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc

do_configure:prepend() {
	sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}
