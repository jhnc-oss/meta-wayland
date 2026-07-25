SUMMARY = "Terminal session recorder and the best companion of asciinema.org"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/asciinema/asciinema.git;protocol=https;nobranch=1"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc

SRCREV = "70c4af0505fe1dbc7a2170392559d258bd4af92c"

do_configure:prepend() {
	sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
