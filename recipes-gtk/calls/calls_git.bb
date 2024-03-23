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

SRC_URI = "gitsm://gitlab.gnome.org/GNOME/calls.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
SRCREV = "db9b771c19a22cf1ee46e1bce60c69a6c4c0e155"
PV = "46.0"

inherit meson vala pkgconfig mime-xdg gtk-icon-cache

FILES:${PN} += "${datadir}"

