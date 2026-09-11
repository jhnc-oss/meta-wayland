SUMMARY = "fd is a program to find entries in your filesystem"
HOMEPAGE = "https://github.com/sharkdp/fd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=96713c739748a44f86272791c89ce344"

SRC_URI = "git://github.com/sharkdp/fd.git;protocol=https;branch=master;tag=v10.5.0"

SRCREV = "4f81778774463bf414a184cbe6d5219ad2229646"

inherit cargo cargo-update-recipe-crates

require ${BPN}-crates.inc

do_configure:prepend() {
    sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}
