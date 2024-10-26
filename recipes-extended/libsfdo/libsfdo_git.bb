SUMMARY = "A collection of libraries which implement some of the freedesktop.org specifications."
HOMEPAGE = "https://gitlab.freedesktop.org/vyivel/libsfdo"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fbd65380cdd255951079008b364516c"

inherit meson pkgconfig

SRC_URI = "git://gitlab.freedesktop.org/vyivel/libsfdo.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
PV = "0.1.3"
SRCREV = "b3936ed9826375334dbbaa999e7216d1b36b445b"

PACKAGECONFIG ?= ""
PACKAGECONFIG[examples] = "-Dexamples=true,-Dexamples=false"
PACKAGECONFIG[tests] = "-Dtests=true,-Dtests=false"
