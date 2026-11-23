SUMMARY = "fd is a program to find entries in your filesystem"
HOMEPAGE = "https://github.com/sharkdp/fd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=96713c739748a44f86272791c89ce344"

SRC_URI = "git://github.com/sharkdp/fd.git;protocol=https;branch=master;tag=v${PV}"

SRCREV = "b2a287b3993768e0ec52f0852916917f23fb2a38"

inherit ptest-cargo cargo-update-recipe-crates

require ${BPN}-crates.inc

do_configure:prepend() {
    sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}

RDEPENDS:${PN}-ptest += "coreutils"

INSANE_SKIP:${PN}-ptest += "buildpaths"
