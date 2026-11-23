SUMMARY = "The Budgie Desktop is a feature-rich, modern desktop designed to keep out the way of the user"
HOMEPAGE = "https://github.com/BuddiesOfBudgie/budgie-desktop"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"


DEPENDS = " \
    gtk+3 \
    glib-2.0 \
    libgee \
    libgtop \
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
SRC_URI += "file://0002-Drop-the-libcanberra-gtk3-dependency.patch"
SRCREV = "850d1a20481c77400b4bc580691a1226d3c638c5"

GTKDOC_MESON_OPTION = "with-gtk-doc"
GIR_MESON_OPTION = ""

EXTRA_OEMESON = "-Dwith-runtime-dependencies=false"

FILES:${PN} += " ${libdir}/budgie-desktop ${datadir}"

RRECOMMENDS:${PN} = " \
    swayidle \
    gammastep \
    grim \
    labwc \
    slurp \
    swaybg \
    gtklock \
    wlopm \
    budgie-control-center \
    budgie-desktop-view \
    budgie-session \
    budgie-backgrounds \
    ${@bb.utils.contains('DISTRO_FEATURES', 'kde', "budgie-desktop-services budgie-display-configurator", '', d)} \
    gnome-settings-daemon \
    gnome-desktop \
    gsettings-desktop-schemas \
"
