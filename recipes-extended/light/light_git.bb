SUMMARY = "A program to control backlights (and other hardware lights) in GNU/Linux."
HOMEPAGE = "https://github.com/haikarainen/light"
SECTION = "libs"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://gitlab.com/dpeukert/light;protocol=https;branch=main"

PV = "1.2.2"
SRCREV = "2a54078cbe3814105ee4f565f451b1b5947fbde0"

CFLAGS += " -fcommon"

inherit autotools pkgconfig

