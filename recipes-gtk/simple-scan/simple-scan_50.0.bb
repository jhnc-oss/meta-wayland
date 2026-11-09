SUMMARY = "Document Scanner for GNOME"
HOMEPAGE = "https://gitlab.gnome.org/GNOME/simple-scan"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://gitlab.gnome.org/GNOME/simple-scan.git;protocol=https;nobranch=1;tag=${PV}"
SRCREV = "d3de664860c6a5e9ec477b127dab82539f2cf184"

DEPENDS = " \
    glib-2.0 \
    gtk4 \
    libadwaita \
    libgusb \
    colord \
    sane-backends \
    zlib \
    cairo \
    gdk-pixbuf \
    itstool-native \
    libxml2-native \
"

inherit meson pkgconfig gettext vala gsettings gtk-icon-cache mime-xdg features_check

ANY_OF_DISTRO_FEATURES = "${GTK3DISTROFEATURES}"
REQUIRED_DISTRO_FEATURES = "opengl"

GTKIC_VERSION = "4"

PACKAGECONFIG ??= "webp"
PACKAGECONFIG[webp] = ",,libwebp"

FILES:${PN} += "${datadir}/metainfo ${datadir}/help"

RRECOMMENDS:${PN} += "sane-backends-escl"
