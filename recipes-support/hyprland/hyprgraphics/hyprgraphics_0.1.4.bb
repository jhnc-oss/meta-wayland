SUMMARY = "Hyprgraphics is a small C++ library with graphics / resource related utilities used across the hypr* ecosystem"
HOMEPAGE = "https:/github.com/hyprwm/hypgraphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman cairo jpeg hyprutils libwebp libjxl libpng file"

SRC_URI = "git://github.com/hyprwm/hyprgraphics.git;protocol=https;branch=main"

SRCREV = "b3d628d01693fb9bb0a6690cd4e7b80abda04310"
inherit cmake pkgconfig
