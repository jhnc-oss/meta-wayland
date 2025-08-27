SUMMARY = "QT6 Theme Provider for Hyprland"
HOMEPAGE = "https://github.com/hyprwm/hyprqt6engine"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

SRC_URI = "git://github.com/hyprwm/hyprqt6engine.git;protocol=https;branch=main"

SRCREV = "e8a694d5fc7813cf477f426dce731967e4cf670b"

DEPENDS = "qtbase  qtquick3d qttools-native hyprutils hyprlang"

inherit qt6-cmake pkgconfig

PACKAGECONFIG ?= "kde"
PACKAGECONFIG[kde] = ",,kconfig kiconthemes kcolorscheme"

EXTRA_OECMAKE += "-DPLUGINDIR=${libdir}/plugins"

FILES:${PN} += "${libdir}/plugins ${libdir}/libhyprqt6engine-common.so"
FILES:${PN}-dev = ""
