SUMMARY = "A phone dialer and call handler."
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS = " \
    appstream-native \
    callaudiod \
    desktop-file-utils-native \
    evolution-data-server \
    feedbackd \
    folks \
    glib-2.0 \
    glibmm \
    gom \
    gstreamer1.0 \
    gstreamer1.0-plugins-good \
    libhandy \
    libpeas \
    libsecret \
    libsoup \
    libxml2 \
    modemmanager \
    openldap \
    python3-docutils-native \
    sofia-sip \
"

SRC_URI = "gitsm://gitlab.gnome.org/GNOME/calls.git;protocol=https;nobranch=1;name=calls"
SRC_URI += "git://gitlab.gnome.org/World/Phosh/libcall-ui;protocol=https;subdir=${S}/subprojects/libcall-ui;name=libcall-ui;nobranch=1"
SRCREV_calls = "271ab5a5acccbc6de44995414ab2093c1f6688ec"
SRCREV_libcall-ui = "3a2044f8e7c45387954ed35d22c6b6309e6751d6"
SRCREV_FORMAT = "calls"

inherit meson vala pkgconfig mime-xdg gtk-icon-cache

EXTRA_OEMESON += "-Dtests=false"

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"

