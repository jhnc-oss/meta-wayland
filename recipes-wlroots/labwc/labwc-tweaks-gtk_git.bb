
SUMMARY = "This is a [WIP] configuration gui app for labwc without any real plan or Acceptance Criteria"
HOMEPAGE = "https://github.com/labwc/labwc-tweaks"
SECTION = "graphics"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	libxml2 \
	glib-2.0 \
	gtk+3 \
"

SRC_URI = "git://github.com/labwc/labwc-tweaks-gtk.git;protocol=https;branch=master"

SRCREV = "405a3adcb2851436145a023d437d08a652583a1a"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

FILES:${PN} += "${datadir}"
