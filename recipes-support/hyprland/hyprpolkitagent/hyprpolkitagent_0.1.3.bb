SUMMARY = "A simple polkit authentication agent for Hyprland, written in QT/QML."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=778ddc598b3f2a2da3657dda514da983"

SRC_URI = "git://github.com/hyprwm/hyprpolkitagent.git;protocol=https;branch=main"

SRCREV = "a259bf1fcf141dc0fc49c242510814ea6ac33387"
PV:append = "+git"

DEPENDS = "hyprtoolkit polkit hyprutils sdbus-c++ libdrm pixman hyprgraphics"

inherit cmake pkgconfig

FILES:${PN} += "${systemd_user_unitdir} ${datadir}/dbus-1"
