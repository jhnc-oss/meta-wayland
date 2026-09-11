SUMMARY = "Varlink library and code generator"
HOMEPAGE = "https://gitlab.freedesktop.org/emersion/vali"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4d4eb3762266c7fef451d19393821f49"

DEPENDS = "json-c aml"

SRC_URI = "git://gitlab.freedesktop.org/emersion/vali.git;protocol=https;branch=master;tag=v${PV}"
SRC_URI += "file://0001-pkgconfig-do-not-hardcode-the-installed-path-of-the-.patch"
SRCREV = "bd4b709430eef9a1252198f9a0ea4a05930eda26"

inherit meson pkgconfig

BBCLASSEXTEND = "native"
