SUMMARY = "This package provides encoder/decoder implementation for DEC SIXEL graphics"
HOMEPAGE = "https://github.com/saitoha/libsixel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8a5b9748852a1997036ef6e0ebfdba3"

DEPENDS = "gdk-pixbuf jpeg libpng curl gd"

inherit autotools pkgconfig gettext bash-completion

SRC_URI = "git://github.com/saitoha/libsixel.git;protocol=https;nobranch=1"
SRCREV = "764f4e618c8bbc427fb74622e3227243fe6762fb"

FILES:${PN} += "${datadir}/zsh ${libdir}/python*"
