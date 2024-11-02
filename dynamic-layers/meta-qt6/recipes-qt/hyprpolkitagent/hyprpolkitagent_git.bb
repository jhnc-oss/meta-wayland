SUMMARY = "A simple polkit authentication agent for Hyprland, written in QT/QML."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprpolkitagent.git;protocol=https;branch=main"

SRCREV = "615efd49303cb164bbf4ad065792e02d8f652a36"
S = "${WORKDIR}/git"
PV = "0.1.1"

DEPENDS = "qtbase qtquick3d qttools-native qtwayland qtwayland-native polkit polkit-qt hyprutils"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${systemd_user_unitdir} ${datadir}/dbus-1"
