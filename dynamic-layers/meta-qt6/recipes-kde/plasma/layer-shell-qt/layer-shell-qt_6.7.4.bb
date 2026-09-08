SUMMARY = "This component is meant for applications to be able to easily use clients based on wlr-layer-shell"
HOMEPAGE = "https://invent.kde.org/plasma/layer-shell-qt"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.1-only AND LGPL-3.0-only AND LGPL-3.0-or-later AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=f225922a2c12dfa5218fb70c49db3ea6 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-3.0-only.txt;md5=852ecadc0ac7e6f4d7144d5544a3815b \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=3000208d539ec061b899bce1d9ce9404 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
"

SRC_URI = "git://invent.kde.org/plasma/layer-shell-qt.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "1613a5f61150192d8187989466d4ff961f4ce2c4"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
    wayland \
    wayland-native \
    wayland-protocols \
    libxkbcommon \ 
"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins"
