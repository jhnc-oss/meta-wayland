SUMMARY = "The Budgie Desktop is a feature-rich, modern desktop designed to keep out the way of the user"
HOMEPAGE = "https://github.com/BuddiesOfBudgie/budgie-desktop"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"


DEPENDS = " \
    gtk+3 \
    glib-2.0 \
    libgee \
    libpeas \
    gdk-pixbuf \
    util-linux \
    gstreamer1.0 \
    cairo \
    gtk-layer-shell \
    ibus \
    gnome-desktop \
    gsettings-desktop-schemas \
    gnome-settings-daemon \
    libwnck3 \
    accountsservice \
    libcanberra \
    libxfce4windowing \
    upower \
    intltool-native \
    polkit \
    labwc \
    sassc-native \
"

inherit meson pkgconfig gettext gobject-introspection gtk-doc vala features_check

RRECOMMENDS:${PN} = "swayidle gammastep grim slurp swaybg gtklock wlopm"

REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"

SRC_URI = "gitsm://github.com/BuddiesOfBudgie/budgie-desktop.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-budgie.enums-templates-fix-reproducibility.patch"
SRCREV = "7d1558ce966b7dddae6a92c5d6dd10f64ab2910b"

GTKDOC_MESON_OPTION = "with-gtk-doc"
GIR_MESON_OPTION = ""

EXTRA_OEMESON = "-Dwith-runtime-dependencies=false"

FILES:${PN} += " ${libdir}/budgie-desktop ${datadir}"

RRECOMMENDS:${PN} = " \
    swayidle \
    gammastep \
    grim \
    slurp \
    swaybg \
    gtklock \
    wlopm \
    budgie-control-center \
    ${@bb.utils.contains('DISTRO_FEATURES', 'kde', "budgie-desktop-services", '', d)} \
"
