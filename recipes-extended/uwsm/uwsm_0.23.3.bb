SUMMARY = "Wraps standalone Wayland compositors into a set of Systemd units on the fly"
HOMEPAGE = "https://github.com/Vladimir-csp/uwsm"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0bcdc63de832340797303f320ae6af32"

inherit meson pkgconfig manpages

EXTRA_OEMESON = "-Dpython-bin=${bindir}/python3"

SRC_URI = " \
	git://github.com/Vladimir-csp/uwsm.git;protocol=https;branch=master \
	file://0001-uwsm-meson.build-dont-fail-for-missing-python-module.patch \
"
SRCREV = "cf2b1d84059f1954d4ec864f2b46a86515acc3c1"


PACKAGECONFIG ?= ""
PACKAGECONFIG[manpages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"
PACKAGECONFIG[uuctl] = "-Duuctl=enabled,-Duuctl=disabled,,fuzzel"

FILES:${PN} += "${datadir}/licenses ${systemd_user_unitdir}"

RDEPENDS:${PN} += "python3-dbus pyxdg python3-core whiptail"
RRECOMMENDS:${PN} += "dbus-broker"
