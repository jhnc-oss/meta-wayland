SUMMARY = "A simple polkit authentication agent for Hyprland, written in QT/QML."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprpolkitagent.git;protocol=https;branch=main"

SRCREV = "7e4054410f6d6331b239fea1c659ad6a917fbf6a"

DEPENDS = "qtbase qtquick3d qttools-native qtwayland qtwayland-native polkit polkit-qt hyprutils"
RDEPENDS:${PN} = "hyprland-qt-support"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${systemd_user_unitdir} ${datadir}/dbus-1"
