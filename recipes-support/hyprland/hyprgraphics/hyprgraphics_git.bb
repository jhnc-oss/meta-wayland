SUMMARY = "Hyprgraphics is a small C++ library with graphics / resource related utilities used across the hypr* ecosystem"
HOMEPAGE = "https:/github.com/hyprwm/hypgraphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

DEPENDS = "pixman cairo jpeg hyprutils libwebp libjxl libspng file"

SRC_URI = "git://github.com/hyprwm/hyprgraphics.git;protocol=https;branch=main"
SRC_URI += "file://0001-hyprgraphics-fix-libspng-name.patch"

S = "${WORKDIR}/git"
SRCREV = "12cd7034e441a5ebfdef1a090c0788413b4a635b"
PV = "0.1.1"
inherit cmake pkgconfig
