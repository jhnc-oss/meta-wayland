SUMMARY = "Clean and customizable greeter for greetd"
HOMEPAGE = "https://github.com/rharish101/ReGreet/"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8da5784ab1c72e63ac74971f88658166"

SRC_URI += "git://github.com/rharish101/ReGreet.git;protocol=https;nobranch=1;branch=main"
SRCREV = "c75486b2e1f3f5e1a30a93c2df050df2b5d61b9f"

DEPENDS = "glib-2.0 gtk4 cairo graphene gdk-pixbuf"

inherit cargo cargo-update-recipe-crates pkgconfig

require ${PN}-crates.inc

RDEPENDS:${PN} = "greetd"
