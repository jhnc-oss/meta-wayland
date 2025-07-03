SUMMARY = "Raw wayland greeter for greetd, to be run under sway or similar."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/wlgreet"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://git.sr.ht/~kennylevinsen/wlgreet;protocol=https;branch=master"
SRCREV = "e4a7d1ff7f91bc28794e2420c7651a8e296c6509"

DEPENDS = "wayland wayland-protocols wayland-native"

inherit cargo cargo-update-recipe-crates

require ${PN}-crates.inc

RDEPENDS:${PN} = "greetd"

