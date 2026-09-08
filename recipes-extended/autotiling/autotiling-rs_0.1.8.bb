SUMMARY = "This automatically alternates the container layout between horizontal and vertical for successive new containers."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8c9e7f297308461c48038d7c1e05cfb8"

SRC_URI = " \
	git://github.com/ammgws/autotiling-rs.git;protocol=https;branch=master;tag=v0.1.8 \
"

inherit cargo cargo-update-recipe-crates

require ${BPN}-crates.inc

SRCREV = "59cefd205247aea03d7e7fa26b878deef3b454de"


CARGO_BUILD_FLAGS += "--config profile.release.strip=false"
