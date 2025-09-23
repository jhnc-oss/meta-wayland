SUMMARY = "Hyprgraphics is a small C++ library with graphics / resource related utilities used across the hypr* ecosystem"
HOMEPAGE = "https:/github.com/hyprwm/hypgraphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman cairo jpeg hyprutils libwebp libpng file"

SRC_URI = "git://github.com/hyprwm/hyprgraphics.git;protocol=https;branch=main"

SRCREV = "32e6b8386f7dc70a4cc01607a826a281f3c52364"
inherit cmake pkgconfig


PACKAGECONFIG ?= "heif jxl"
PACKAGECONFIG[heif] = ",,libheif"
PACKAGECONFIG[jxl] = ",,libjxl"
