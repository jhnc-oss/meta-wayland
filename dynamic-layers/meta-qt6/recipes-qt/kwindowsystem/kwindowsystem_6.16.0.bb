SUMMARY = "Access to the windowing system"
HOMEPAGE = "https://api.kde.org/frameworks/kwindowsystem/html/index.html"
LICENSE = "MIT & LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "https://download.kde.org/stable/frameworks/6.16/kwindowsystem-${PV}.tar.xz"
SRC_URI[sha256sum] = "dc3b5ac5e5eaea5b76af8e85f065ddbce91ff7e3fcc13c6d600ad53bb53b1b31"

DEPENDS = " \
    qtbase \
    qtwayland \
    qtwayland-native \
    qttools-native \
    plasma-wayland-protocols \
"

inherit qt6-cmake

EXTRA_OECMAKE = "-DKWINDOWSYSTEM_X11=OFF"

FILES:${PN} += " \
    ${libdir}/plugins/kf6 \
    ${libdir}/qml \
   ${datadir}/qlogging-categories6 \
"
