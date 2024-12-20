SUMMARY = "Hyprgraphics is a small C++ library with graphics / resource related utilities used across the hypr* ecosystem"
HOMEPAGE = "https:/github.com/hyprwm/hypgraphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman cairo jpeg hyprutils libwebp libjxl file"

SRC_URI = "git://github.com/hyprwm/hyprgraphics.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "0f9b8ca692b319c3cadd10175518805dbdc33ef0"
PV = "0.1.1"
inherit cmake pkgconfig
