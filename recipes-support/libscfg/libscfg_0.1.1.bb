SUMMARY = "A C library for scfg"
HOMEPAGE = "https://git.sr.ht/~emersion/libscfg"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b32b698ab815d1913b4ed31d8c2ee8d7"

SRC_URI = "git://codeberg.org/emersion/libscfg;protocol=https;branch=master"

SRCREV = "649514f1f7c7fb62da22d0862bac837a315673d5"

inherit meson

FILES:${PN} = "${libdir}/libscfg.so"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"

