SUMMARY = "fd is a program to find entries in your filesystem"
HOMEPAGE = "https://github.com/sharkdp/fd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=96713c739748a44f86272791c89ce344"

SRC_URI = "git://github.com/sharkdp/fd.git;protocol=https;branch=master"

SRCREV = "d38148f0aabdd073b4080cde770f679f3197b920"

inherit cargo cargo-update-recipe-crates

require ${BPN}-crates.inc

do_configure:prepend() {
    sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}
