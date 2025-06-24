SUMMARY = "A collection of libraries which implement some of the freedesktop.org specifications."
HOMEPAGE = "https://gitlab.freedesktop.org/vyivel/libsfdo"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=896bac785747ebab7d4e9d693e517573"

inherit meson pkgconfig

SRC_URI = "git://gitlab.freedesktop.org/vyivel/libsfdo.git;protocol=https;nobranch=1"

SRCREV = "b3936ed9826375334dbbaa999e7216d1b36b445b"

PACKAGECONFIG ?= ""
PACKAGECONFIG[examples] = "-Dexamples=true,-Dexamples=false"
PACKAGECONFIG[tests] = "-Dtests=true,-Dtests=false"
