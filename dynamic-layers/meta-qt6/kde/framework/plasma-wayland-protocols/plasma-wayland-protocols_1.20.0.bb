DESCRIPTION = "Plasma Wayland Protocols"
HOMEPAGE = "https://download.kde.org/stable/plasma-wayland-protocols"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

SRC_URI = "https://download.kde.org/stable/plasma-wayland-protocols/plasma-wayland-protocols-${PV}.tar.xz"
SRC_URI[sha256sum] = "9818bb1462211ce5982e670abf0d964eb11fe1d0c02a1c26084db30695a79d6a"

DEPENDS = "extra-cmake-modules"

BBCLASSEXTEND = "native nativesdk"

inherit qt6-cmake

FILES:${PN}-dev += " \
    ${libdir}/cmake/* \
    ${datadir}/plasma-wayland-protocols/* \
"
