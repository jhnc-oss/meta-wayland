
SUMMARY = "labwc-menu-generator - Independent of Desktop Environments and associated menu-packages"
HOMEPAGE = "https://github.com/labwc/labwc-menu-generator"
SECTION = "graphics"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/labwc/labwc-menu-generator.git;protocol=https;branch=master"

SRCREV = "7b62ce9c25db9ee21c9f93e536615569378bcb20"
S = "${WORKDIR}/git"

DEPENDS = "glib-2.0"

inherit meson pkgconfig
