SUMMARY = "Access to the windowing system"
HOMEPAGE = "https://api.kde.org/frameworks/kwindowsystem/html/index.html"
LICENSE = "CC0-1.0 AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/frameworks/kwindowsystem.git;protocol=https;nobranch=1;tag=v6.29.0"
SRC_URI += "file://0001-fix-reproducibility.patch"
SRCREV = "defd0b1be1f4505ff0f8d6d340ad6848716e7a67"

DEPENDS = " \
	qtbase-native \
	qttools-native \
	qtquick3d \
	plasma-wayland-protocols \
"

inherit cmake pkgconfig

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DKWINDOWSYSTEM_X11=ON,-DKWINDOWSYSTEM_X11=OFF,libx11 libxcb xcb-util-keysyms xcb-util-wm"

EXTRA_OECMAKE += "-DQT_HOST_PATH:PATH=${RECIPE_SYSROOT_NATIVE}${prefix_native}"

FILES:${PN} += " \
    ${libdir}/plugins/kf6 \
    ${libdir}/qml \
   ${datadir}/qlogging-categories6 \
"
