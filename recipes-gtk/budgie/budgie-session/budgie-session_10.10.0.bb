SUMMARY = "Budgie Session is a softish fork of gnome-session, designed to provide a stable session manager for Budgie 10.x"
HOMEPAGE = "https://github.com/BuddiesOfBudgie/budgie-session"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"


DEPENDS = " \
    glib-2.0 \
    gtk+3 \
    libice \
    libsm \
    libx11 \
    xtrans \
    json-glib \
    gnome-desktop \
"


inherit meson pkgconfig gettext manpages

SRC_URI = "git://github.com/BuddiesOfBudgie/budgie-session.git;protocol=https;nobranch=1"
SRCREV = "9edd901a6225bf7762faa709b6b2554fa538f766"

PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', 'consolekit', d)}"
PACKAGECONFIG[systemd] = "-Dsystemd=true, -Dsystemd=false, systemd"
PACKAGECONFIG[consolekit] = "-Dconsolekit=true, -Dconsolekit=false, consolekit dbus-glib"
PACKAGECONFIG[manpages] = "-Dman=true, -Dman=false, xmlto-native libxslt-native"

FILES:${PN} += "${datadir}"

