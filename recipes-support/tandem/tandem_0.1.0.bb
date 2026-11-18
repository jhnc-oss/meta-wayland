SUMMARY = "KDE Connect client for Linux desktops"
DESCRIPTION = "Pairs the desktop with phones running KDE Connect: notifications, \
clipboard, file sharing, media and volume control, remote input, calls and \
messages. A D-Bus activated background service with a status notifier item and \
a GTK, a Kirigami or a Noctalia window, talking only to standard desktop services."
HOMEPAGE = "https://github.com/MarkusVolk/tandem"
LICENSE = "GPL-2.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=3d26203303a722dedc6bf909d95ba815 \
    file://noctalia/LICENSE.noctalia;md5=5bd433caa90a88d62bd293dabc90f4a3 \
    file://noctalia/lib/assets/fonts/tabler-icons-license.txt;md5=ed422355f685d767a7c19898a8afa7d9 \
"

SRC_URI = "git://github.com/MarkusVolk/tandem.git;protocol=https;branch=main"
SRCREV = "536a970befc4fe4e92483add1ad8918a9ef8d41b"

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
PACKAGECONFIG[noctalia] = "-Dnoctalia=enabled,-Dnoctalia=disabled,wayland wayland-native wayland-protocols virtual/egl virtual/libgles2 freetype fontconfig cairo pango harfbuzz stb tomlplusplus nlohmann-json"
PACKAGECONFIG[pulse] = "-Dpulse=enabled,-Dpulse=disabled,pulseaudio"
PACKAGECONFIG[gstreamer] = "-Dgstreamer=enabled,-Dgstreamer=disabled,gstreamer1.0"
PACKAGECONFIG[wayland] = "-Dwayland=enabled,-Dwayland=disabled,wayland wayland-native wayland-protocols"

PACKAGES =+ "${PN}-gtk ${PN}-qt ${PN}-noctalia"

FILES:${PN}-gtk = " \
    ${bindir}/tandem-gtk \
    ${@bb.utils.contains('PACKAGECONFIG', 'gtk', '${datadir}/applications ${datadir}/dbus-1/services/de.flk.Tandem.service', '', d)} \
"

FILES:${PN}-qt = " \
    ${bindir}/tandem-qt \
    ${@bb.utils.contains('PACKAGECONFIG', 'qt', '${datadir}/applications ${datadir}/dbus-1/services/de.flk.Tandem.service', '', d)} \
"

FILES:${PN}-noctalia = " \
    ${bindir}/tandem-noctalia \
    ${datadir}/tandem \
    ${datadir}/licenses/tandem \
    ${@bb.utils.contains('PACKAGECONFIG', 'noctalia', '${datadir}/applications ${datadir}/dbus-1/services/de.flk.Tandem.service', '', d)} \
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
RDEPENDS:${PN}-noctalia = "${PN}"
RRECOMMENDS:${PN}-noctalia = "xdg-desktop-portal"
RDEPENDS:${PN}-qt = "${PN} ${@bb.utils.contains('PACKAGECONFIG', 'qt', 'kirigami kirigami-addons qqc2-desktop-style qtdeclarative-qmlplugins', '', d)}"
RRECOMMENDS:${PN} = "sound-theme-freedesktop avahi-daemon xdg-desktop-portal ${@bb.utils.contains('PACKAGECONFIG', 'gstreamer', 'gstreamer1.0-plugins-base-playback gstreamer1.0-plugins-base-ogg gstreamer1.0-plugins-base-vorbis gstreamer1.0-plugins-good-pulseaudio', '', d)}"
