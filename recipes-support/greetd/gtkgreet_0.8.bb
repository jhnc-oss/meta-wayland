SUMMARY = "GTK based greeter for greetd, to be run under cage or similar."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/gtkgreet"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "gtk+3 json-c"
RDEPENDS:${PN} += "greetd"
RRECOMMENDS:${PN} += "dbus-broker"

PACKAGECONFIG[layershell] = "-Dlayershell=enabled,-Dlayershell=disabled,gtk-layer-shell"

PACKAGECONFIG ?= "layershell"

inherit meson pkgconfig

SRC_URI = "git://git.sr.ht/~kennylevinsen/gtkgreet;protocol=https;branch=master"

SRCREV = "7202ba6ec2334d64e1449e5f8310a63bd818d448"

EXTRA_OEMESON += " \
    --buildtype release \
    -Dman-pages=disabled \
"
