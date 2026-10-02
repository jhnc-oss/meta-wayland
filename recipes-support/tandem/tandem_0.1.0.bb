SUMMARY = "KDE Connect client for Linux desktops"
DESCRIPTION = "Pairs the desktop with phones running KDE Connect: notifications, \
clipboard, file sharing, media and volume control, remote input, calls and \
messages. A D-Bus activated background service with a status notifier item and \
a GTK or a Kirigami window, talking only to standard desktop services."
HOMEPAGE = "https://github.com/MarkusVolk/tandem"
LICENSE = "GPL-2.0-or-later AND MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d26203303a722dedc6bf909d95ba815"

SRC_URI = "git://github.com/MarkusVolk/tandem.git;protocol=https;branch=main"
SRCREV = "2a021fb53c2cdac3a17907c4058f4b9dcab2fd4f"

DEPENDS = " \
    glib-2.0 \
    json-glib \
    gnutls \
    libxkbcommon \
"

inherit meson pkgconfig gsettings systemd

do_configure:prepend() {
	export PATH=${STAGING_DIR_NATIVE}${libexecdir}:$PATH
}

SYSTEMD_SERVICE:${PN} = "tandemd.service"
SYSTEMD_AUTO_ENABLE:${PN} = "disable"

PACKAGECONFIG ??= "pulse gstreamer wayland"
PACKAGECONFIG[gtk] = "-Dgtk=enabled,-Dgtk=disabled,gtk4 libadwaita"
PACKAGECONFIG[qt] = "-Dqt=enabled,-Dqt=disabled,qtbase qtbase-native qtdeclarative qtdeclarative-native"
PACKAGECONFIG[pulse] = "-Dpulse=enabled,-Dpulse=disabled,pulseaudio"
PACKAGECONFIG[gstreamer] = "-Dgstreamer=enabled,-Dgstreamer=disabled,gstreamer1.0"
PACKAGECONFIG[wayland] = "-Dwayland=enabled,-Dwayland=disabled,wayland wayland-native wayland-protocols"

PACKAGES =+ "${PN}-gtk ${PN}-qt"

FILES:${PN}-gtk = " \
    ${bindir}/tandem-gtk \
    ${@bb.utils.contains('PACKAGECONFIG', 'gtk', '${datadir}/applications ${datadir}/dbus-1/services/de.flk.Tandem.service', '', d)} \
"

FILES:${PN}-qt = " \
    ${bindir}/tandem-qt \
    ${@bb.utils.contains('PACKAGECONFIG', 'qt', '${datadir}/applications ${datadir}/dbus-1/services/de.flk.Tandem.service', '', d)} \
"

FILES:${PN} += " \
    ${systemd_user_unitdir} \
    ${datadir}/dbus-1/system.d \
    ${datadir}/dbus-1/services/de.flk.Tandem.Daemon.service \
    ${datadir}/icons/hicolor \
    ${datadir}/metainfo \
"

RRECOMMENDS:${PN}-gtk = "${@bb.utils.contains('PACKAGECONFIG', 'gtk', 'adwaita-icon-theme', '', d)}"

RDEPENDS:${PN} = "glib-networking xdg-user-dirs"
RDEPENDS:${PN}-gtk = "${PN}"
RDEPENDS:${PN}-qt = "${PN} ${@bb.utils.contains('PACKAGECONFIG', 'qt', 'kirigami kirigami-addons qqc2-desktop-style qtdeclarative-qmlplugins', '', d)}"
RRECOMMENDS:${PN} = "sound-theme-freedesktop avahi-daemon xdg-desktop-portal ${@bb.utils.contains('PACKAGECONFIG', 'gstreamer', 'gstreamer1.0-plugins-base-playback gstreamer1.0-plugins-base-ogg gstreamer1.0-plugins-base-vorbis gstreamer1.0-plugins-good-pulseaudio', '', d)}"
