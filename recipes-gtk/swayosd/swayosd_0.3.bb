SUMMARY = "A OSD window for common actions like volume and capslock."
HOMEPAGE = "https://github.com/ErikReider/SwayOSD"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "autoconf-native automake-native glib-2.0-native sassc-native gtk4 gtk4-layer-shell pango pulseaudio libinput"

SRC_URI = "git://github.com/ErikReider/SwayOSD.git;protocol=https;branch=main"

SRCREV = "6a38a0994dfaf95ed6b778cc13d360767d95f234"

inherit cargo pkgconfig  cargo-update-recipe-crates gettext

require ${PN}-crates.inc

CARGO_BUILD_FLAGS:remove = "--frozen"
CARGO_BUILD_FLAGS:append = " --offline"
