SUMMARY = "A C library for scfg"
HOMEPAGE = "https://git.sr.ht/~emersion/libscfg"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e316e9609dd7672b87ff25b46b2cf3e1"

SRC_URI = "git://git.sr.ht/~emersion/libscfg;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "0.1.1"
SRCREV = "94076e2d03df183decac76fc8e5e1249aa7827c5"

inherit meson

