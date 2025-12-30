SUMMARY = "zoxide is a smarter cd command, inspired by z and autojump"
HOMEPAGE = "https://github.com/ajeetdsouza/zoxide"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3db2f084b045f74bdb05b1189934c391"

SRC_URI = "git://github.com/ajeetdsouza/zoxide.git;protocol=https;branch=main"

SRCREV = "859268aec873465b6707f73001003a76adcafabd"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc

do_configure:prepend() {
    sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}
