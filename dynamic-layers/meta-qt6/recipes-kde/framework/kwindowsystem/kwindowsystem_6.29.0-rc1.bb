SUMMARY = "Access to the windowing system"
HOMEPAGE = "https://api.kde.org/frameworks/kwindowsystem/html/index.html"
LICENSE = "MIT AND LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kwindowsystem.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-fix-reproducibility.patch"
SRCREV = "defd0b1be1f4505ff0f8d6d340ad6848716e7a67"

DEPENDS = " \
	qtbase-native \
	qttools-native \
	qtquick3d \
	plasma-wayland-protocols \
	libx11 \
	libxcb \
"

inherit cmake pkgconfig

EXTRA_OECMAKE += "-DQT_HOST_PATH:PATH=${RECIPE_SYSROOT_NATIVE}${prefix_native}"

FILES:${PN} += " \
    ${libdir}/plugins/kf6 \
    ${libdir}/qml \
   ${datadir}/qlogging-categories6 \
"
