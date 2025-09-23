SUMMARY = "Terminal session recorder and the best companion of asciinema.org."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/asciinema/asciinema.git;protocol=https;nobranch=1"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc

SRCREV = "f21ff096f0a1e8f6a7a8616d6923209e1d16e0a1"

do_configure:prepend() {
	sed -i "s|strip\ =\ true|strip\ =\ false|g" ${S}/Cargo.toml
}

# avoid packaging the debug symbols as they contain buildpaths (cargo_home)
PACKAGES:remove = "${PN}-dbg"
INSANE_SKIP:${PN} = "installed-vs-shipped"
