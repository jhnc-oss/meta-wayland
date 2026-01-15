SUMMARY = "Budgie Control Center is a fork of GNOME Settings with the intent of providing a simplified list of settings"
HOMEPAGE = "https://github.com/BuddiesOfBudgie/budgie-control-center"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75859989545e37968a99b631ef42722e"


DEPENDS = " \
    pulseaudio \
    accountsservice \
    colord \
    colord-gtk \
    gdk-pixbuf \
    glib-2.0 \
    gnome-desktop \
    gnome-settings-daemon \
    gsettings-desktop-schemas \
    gsound \
    libxml2 \
    libsecret \
    udisks2 \
    upower \
    libgudev \
    libx11 \
    libxi \
    libepoxy \
    libgtop \
    gcr3 \
    cups \
    libpwquality \
    polkit \
    samba \
    libhandy \
    libnma \
    gtk+3 \
    networkmanager \
    gmmlib \
    libwacom \
    libxslt-native \
    docbook-xsl-stylesheets-native \
"

inherit meson gtk-icon-cache gsettings bash-completion pkgconfig gettext gi-docgen

SRC_URI = "gitsm://github.com/BuddiesOfBudgie/budgie-control-center.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-Add-meson-option-to-pass-sysroot.patch"
SRCREV = "5d4d82b19894cb4378654b7a2339abde21b68842"

EXTRA_OEMESON += "-Doe_sysroot=${STAGING_DIR_HOST}"
GIDOCGEN_MESON_OPTION = 'documentation'

EXTRA_OEMESON += "-Dprofile=default"

PACKAGECONFIG ?= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'bluetooth wayland', d)} \
    cheese \
    ibus \
    cups \
    malcontent \
    bluetooth \
"
PACKAGECONFIG[wayland] = "-Dwayland=true,-Dwayland=false,wayland wayland-native wayland-protocols"
PACKAGECONFIG[cheese] = "-Dcheese=true,-Dcheese=false,cheese"
PACKAGECONFIG[ibus] = "-Dibus=true,-Dibus=false,ibus"
PACKAGECONFIG[malcontent] = "-Dmalcontent=true,-Dmalcontent=false,malcontent"
PACKAGECONFIG[bluetooth] = "-Dbluetooth=true,-Dbluetooth=false,gnome-bluetooth3"
PACKAGECONFIG[ssh] = "-Dssh=true,-Dssh=false"
PACKAGECONFIG[cups] = ",,,cups system-config-printer cups-pk-helper"

FILES:${PN} += "${datadir}"
