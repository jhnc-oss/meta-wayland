SUMMARY = "Sirula (simple rust launcher) is an app launcher for wayland"
HOMEPAGE = "https://github.com/DorianRudolph/sirula.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e49f4652534af377a713df3d9dec60cb"

SRC_URI = " \
    git://github.com/DorianRudolph/sirula.git;protocol=https;nobranch=1;tag=v1.1.0 \
    git://github.com/Artturin/osstrtools.git;protocol=https;branch=fixtypo;name=osstrtools;destsuffix=osstrtools;type=git-dependency \
"

DEPENDS = " \
    gtk-layer-shell \
    gdk-pixbuf \
    glib-2.0 \
    cairo \
    pango \
    gtk+3 \
"

inherit cargo pkgconfig cargo-update-recipe-crates

require ${BPN}-crates.inc

SRCREV = "f4da8f5fe50c367e7684334c31ec65fc0fe6997c"
SRCREV_osstrtools = "6360f4f842eb542ff4e62e75851ea8ba83808471"
SRCREV_FORMAT = "default_osstrtools"
