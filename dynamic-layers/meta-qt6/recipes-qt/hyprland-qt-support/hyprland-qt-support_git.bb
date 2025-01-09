SUMMARY = "A qt6 qml style provider for hypr* apps"
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprland-qt-support.git;protocol=https;branch=main"

SRCREV = "b4e829d8bfd1a2e766f01fc361392572c20a14b7"
S = "${WORKDIR}/git"
PV = "0.1.0"

DEPENDS = "qtbase qtquick3d qttools-native qtwayland qtwayland-native hyprlang"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${libdir}/qml/org/hyprland/style ${libdir}/libhyprland-quick-style.so ${libdir}/libhyprland-quick-style-impl.so"
FILES:${PN}-dev = ""
