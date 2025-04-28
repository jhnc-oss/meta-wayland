SUMMARY = "Hyprgraphics is a small C++ library with graphics / resource related utilities used across the hypr* ecosystem"
HOMEPAGE = "https:/github.com/hyprwm/hypgraphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman cairo jpeg hyprutils libwebp libjxl libspng file"

SRC_URI = "git://github.com/hyprwm/hyprgraphics.git;protocol=https;branch=main"
SRC_URI += "file://0001-hyprgraphics-fix-libspng-name.patch"

S = "${WORKDIR}/git"
SRCREV = "9d7f2687c84c729afbc3b13f7937655570f2978d"
PV = "0.1.3"
inherit cmake pkgconfig
