SUMMARY = "A command-line utility that converts image data into graphics formats or ANSI"
HOMEPAGE = "https://github.com/hpjansson/chafa"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=3000208d539ec061b899bce1d9ce9404"

DEPENDS = "glib-2.0 libavif  libheif jpeg libjxl librsvg tiff libwebp"

inherit autotools pkgconfig gettext gtk-doc

SRC_URI = "git://github.com/hpjansson/chafa.git;protocol=https;nobranch=1"
SRCREV = "af962a328290b42aff03a393844892ca3bf4e9fc"

FILES:${PN} += "${libdir}/chafa"
