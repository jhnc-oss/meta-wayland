SUMMARY = "Disassembler library for x86 and x86-64"
HOMEPAGE = "https://github.com/vmt/udis86"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab079829a9e47b6d81dab3bf5da3f638"

SRC_URI = "git://github.com/canihavesomecoffee/udis86.git;protocol=https;branch=master"
SRC_URI += "file://0001-cmake-add-install-rules-and-exported-find_package-ud.patch"
SRCREV = "5336633af70f3917760a6d441ff02d93477b0c86"
PV:append = "+git"

inherit cmake pkgconfig

PACKAGES =+ "${PN}-udcli"
FILES:${PN}-udcli = "${bindir}/udcli"
FILES:${PN}-dev += "${libdir}/cmake/udis86"
