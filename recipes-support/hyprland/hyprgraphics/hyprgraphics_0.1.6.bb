SUMMARY = "Hyprgraphics is a small C++ library with graphics / resource related utilities used across the hypr* ecosystem"
HOMEPAGE = "https:/github.com/hyprwm/hypgraphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman cairo jpeg hyprutils libwebp libpng file"

SRC_URI = "git://github.com/hyprwm/hyprgraphics.git;protocol=https;branch=main"

SRCREV = "f4995eaa46dad0e5db3834f6d6f0430f4dc3aab9"
inherit cmake pkgconfig


PACKAGECONFIG ?= "heif jxl svg"
PACKAGECONFIG[heif] = ",,libheif"
PACKAGECONFIG[jxl] = ",,libjxl"
PACKAGECONFIG[svg] = ",,librsvg"
