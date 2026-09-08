SUMMARY = "libkscreen is the screen management library for KDE Plasma Workspaces"
HOMEPAGE = "https://invent.kde.org/plasma/libkscreen"
LICENSE = "CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.1-or-later AND LicenseRef-KDE-Accepted-GPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
"

SRC_URI = "git://invent.kde.org/plasma/libkscreen.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "33432e490d0adc6c1ded65d2d24cf0ec7f24da0f"

DEPENDS = " \
    qtbase \
    qttools-native \
    wayland \
    wayland-native \
    plasma-wayland-protocols \   
"

inherit kf6 gettext

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = ",-DCMAKE_DISABLE_FIND_PACKAGE_X11=ON,libx11 libxcb"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir} ${datadir} ${systemd_user_unitdir}"
