
SUMMARY = "This is a [WIP] configuration gui app for labwc without any real plan or Acceptance Criteria"
HOMEPAGE = "https://github.com/labwc/labwc-tweaks"
SECTION = "graphics"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	libxml2 \
	qtbase \
	qttools-native \
"

SRC_URI = "git://github.com/labwc/labwc-tweaks.git;protocol=https;branch=master"

SRCREV = "0d72116e9f3e9430131973a73caa8295cb0e20f0"

inherit qt6-cmake pkgconfig features_check

FILES:${PN} += "${datadir}"
