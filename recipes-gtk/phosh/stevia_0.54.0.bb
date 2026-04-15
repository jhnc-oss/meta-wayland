SUMMARY = "Stevia is a on screen keyboard for Phosh"
HOMEPAGE = "https://gitlab.gnome.org/World/Phosh/stevia"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = " \
    glib-2.0 \
    dconf \
    gmobile \
    gnome-desktop \
    gsettings-desktop-schemas \
    gtk+3 \
    json-glib \
    feedbackd \
    libhandy \
    wayland \
    wayland-native \
    wayland-protocols \
    libxkbcommon \
    hunspell \
    uim \
"

inherit gsettings meson pkgconfig gtk-icon-cache gi-docgen gobject-introspection manpages systemd

SRC_URI = "git://gitlab.gnome.org/World/Phosh/stevia.git;protocol=https;nobranch=1"
SRCREV = "65cc045db346c65a47bb02370e1f82e81a327291"

PACKAGECONFIG ?= ""
PACKAGECONFIG[manpages] = "-Dman=true,-Dman=false,python3-docutils-native"

GIR_MESON_OPTION = ''

EXTRA_OEMESON += "--cross-file=${WORKDIR}/meson-${PN}.cross"

do_write_config:append() {
    cat >${WORKDIR}/meson-${PN}.cross <<EOF
[binaries]
fzf = '${bindir}/fzf'
EOF
}

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"

RDEPENDS:${PN} += "fzf"
