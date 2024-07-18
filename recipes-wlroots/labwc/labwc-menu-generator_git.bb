
SUMMARY = "labwc-menu-generator - Independent of Desktop Environments and associated menu-packages"
HOMEPAGE = "https://github.com/labwc/labwc-menu-generator"
SECTION = "graphics"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/labwc/labwc-menu-generator.git;protocol=https;branch=master"

SRCREV = "ee3d8d0ca49c8ad413f64d44d42215fefb79c4be"
S = "${WORKDIR}/git"
PV = "0.1.0"

DEPENDS = "glib-2.0"

inherit meson pkgconfig
