SUMMARY = "Hyprgraphics is a small C++ library with graphics / resource related utilities used across the hypr* ecosystem"
HOMEPAGE = "https:/github.com/hyprwm/hypgraphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman cairo jpeg hyprutils libwebp libpng file"

SRC_URI = "git://github.com/hyprwm/hyprgraphics.git;protocol=https;branch=main"

SRCREV = "ffc999d980c7b3bca85d3ebd0a9fbadf984a8162"
inherit cmake pkgconfig


PACKAGECONFIG ?= "heif jxl svg"
PACKAGECONFIG[heif] = ",,libheif"
PACKAGECONFIG[jxl] = ",,libjxl"
PACKAGECONFIG[svg] = ",,librsvg"
