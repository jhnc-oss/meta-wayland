SUMMARY = "Lightweight KMS plane library."
HOMEPAGE = "https://gitlab.freedesktop.org/emersion/libliftoff"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=706cd9899438a9385250ab6773c1fa53"

SRC_URI = "git://gitlab.freedesktop.org/emersion/libliftoff.git;branch=master;protocol=https"

DEPENDS = "libdrm"

SRCREV = "8b08dc1c14fd019cc90ddabe34ad16596b0691f4"

inherit meson pkgconfig
