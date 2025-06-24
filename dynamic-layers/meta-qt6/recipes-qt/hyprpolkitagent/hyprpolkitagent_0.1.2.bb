SUMMARY = "A simple polkit authentication agent for Hyprland, written in QT/QML."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprpolkitagent.git;protocol=https;branch=main"

SRCREV = "0f0d412d4f8479c6f67f39bd6941b2f07343ff66"

DEPENDS = "qtbase qtquick3d qttools-native qtwayland qtwayland-native polkit polkit-qt hyprutils"
RDEPENDS:${PN} = "hyprland-qt-support"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${systemd_user_unitdir} ${datadir}/dbus-1"
