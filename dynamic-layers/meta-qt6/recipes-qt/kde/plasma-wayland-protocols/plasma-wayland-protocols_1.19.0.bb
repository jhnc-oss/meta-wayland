DESCRIPTION = "Plasma Wayland Protocols"
HOMEPAGE = "https://download.kde.org/stable/plasma-wayland-protocols"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

SRC_URI = "https://download.kde.org/stable/plasma-wayland-protocols/plasma-wayland-protocols-${PV}.tar.xz"
SRC_URI[sha256sum] = "45679fe7a63c414f2c81793a62528fae6ccee584b6965719d7f9fc6dd48ba846"

DEPENDS = "extra-cmake-modules qtwayland-native"

BBCLASSEXTEND = "native nativesdk"

inherit qt6-cmake

FILES:${PN}-dev += " \
    ${libdir}/cmake/* \
    ${datadir}/plasma-wayland-protocols/* \
"
