SUMMARY = "A qt6 qml style provider for hypr* apps"
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprland-qt-support.git;protocol=https;branch=main"

SRCREV = "767e884cda77bea293982c2116333308930d7800"

DEPENDS = "qtbase qtquick3d qttools-native hyprlang"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${libdir}/qml/org/hyprland/style ${libdir}/libhyprland-quick-style.so ${libdir}/libhyprland-quick-style-impl.so"
FILES:${PN}-dev = ""
