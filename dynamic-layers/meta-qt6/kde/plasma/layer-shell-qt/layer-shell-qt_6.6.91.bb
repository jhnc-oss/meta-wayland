SUMMARY = "This component is meant for applications to be able to easily use clients based on wlr-layer-shell"
HOMEPAGE = "https://invent.kde.org/plasma/layer-shell-qt"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=f225922a2c12dfa5218fb70c49db3ea6"

SRC_URI = "git://invent.kde.org/plasma/layer-shell-qt.git;protocol=https;nobranch=1"
SRCREV = "d2326651eabdad8e080334fe7dd28e76eb36ef73"

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
