SUMMARY = "Access to the windowing system"
HOMEPAGE = "https://api.kde.org/frameworks/kwindowsystem/html/index.html"
LICENSE = "MIT & LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "https://download.kde.org/stable/frameworks/6.18/kwindowsystem-${PV}.tar.xz"
SRC_URI[sha256sum] = "a0a046039a11baebacd96d836e5765b981426f60d2cea9ff9a99ba8dbe56178e"

DEPENDS = " \
	qtbase \
	qtwayland \
	qtwayland-native \
	qttools-native \
	plasma-wayland-protocols \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE = "-DKWINDOWSYSTEM_X11=OFF"

FILES:${PN} += " \
    ${libdir}/plugins/kf6 \
    ${libdir}/qml \
   ${datadir}/qlogging-categories6 \
"
