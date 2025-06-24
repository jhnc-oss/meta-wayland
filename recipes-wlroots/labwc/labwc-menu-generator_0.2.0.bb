
SUMMARY = "labwc-menu-generator - Independent of Desktop Environments and associated menu-packages"
HOMEPAGE = "https://github.com/labwc/labwc-menu-generator"
SECTION = "graphics"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/labwc/labwc-menu-generator.git;protocol=https;branch=master"

SRCREV = "2ca1be707aca1a06852e3a0ce70941e50bd7c02e"

DEPENDS = "glib-2.0"

inherit meson pkgconfig
