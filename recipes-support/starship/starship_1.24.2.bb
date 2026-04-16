SUMMARY = "The minimal, blazing-fast, and infinitely customizable prompt for any shell"
HOMEPAGE = "https://github.com/starship/starship"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a25cce5cb436456c4b21461a3ff95b0d"

SRC_URI = "git://github.com/starship/starship.git;protocol=https;nobranch=1"
SRCREV = "33f7077fbe9d7f30476c96645e482be323d42566"

inherit cargo cargo-update-recipe-crates

require ${BPN}-crates.inc

do_configure:prepend() {
    sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}
