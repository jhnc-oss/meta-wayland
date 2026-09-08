SUMMARY = "KWayland is a Qt-style API to interact with the wayland-client API"
HOMEPAGE = "https://invent.kde.org/plasma/kwayland"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL AND MIT-CMU AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT-CMU.txt;md5=b6936b5be2ab721140d9bf57c37b0b92 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/plasma/kwayland.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "b8fa7d1970a456147393a09eb4abd5c65c2719cc"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    wayland \
    wayland-native \
    wayland-protocols \
    plasma-wayland-protocols \
    virtual/egl \
"

inherit qt6-cmake

FILES:${PN} += "${datadir}/qlogging-categories6"
