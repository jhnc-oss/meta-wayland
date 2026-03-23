SUMMARY = "libvips : an image processing library"
HOMEPAGE = "https://github.com/dloebl/libvips"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = "glib-2.0 expat fontconfig libheif jpeg lcms orc libpng poppler libjxl librsvg tiff libwebp zlib libexif"

inherit meson  pkgconfig gettext gobject-introspection gi-docgen

SRC_URI = "git://github.com/dloebl/libvips.git;protocol=https;nobranch=1"
SRCREV = "d00e58e8afa0bb11830d4f6fdeacc076eb6bf748"

GIR_MESON_ENABLE_FLAG = 'enabled'
GIR_MESON_DISABLE_FLAG = 'disabled'
GIDOCGEN_MESON_OPTION = 'docs'

FILES:${PN} += "${libdir}/vips-modules-*"
