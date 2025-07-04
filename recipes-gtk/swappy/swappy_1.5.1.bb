SUMMARY = "A Wayland native snapshot and editor tool, inspired by Snappy on macOS"
HOMEPAGE = "https://github.com/jtheoof/swappy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81524e81ed2bc7b472566654e4767a52"

DEPENDS = " \
    gtk+3 \
    cairo \
    pango \
"

RRECOMMENDS:${PN} = "grim slurp"

inherit meson gtk-icon-cache mime-xdg pkgconfig manpages

SRC_URI = " \
    git://github.com/jtheoof/swappy.git;protocol=https;branch=master \
"

SRCREV = "a996b2cec65aadd04ded780f141b02c5bdfbeb32"

PACKAGECONFIG[manpages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"
