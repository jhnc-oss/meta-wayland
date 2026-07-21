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
SRCREV = "469a39a5436f6c1086b4904d42227c03aee2e394"


PACKAGECONFIG ?= "uuctl uwsm-app fumon"
PACKAGECONFIG[manpages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"
PACKAGECONFIG[uuctl] = "-Duuctl=enabled,-Duuctl=disabled,,fuzzel"
PACKAGECONFIG[uwsm-app] = "-Duwsm-app=enabled,-Duwsm-app=disabled"
PACKAGECONFIG[fumon] = "-Dfumon=enabled,-Dfumon=disabled"

FILES:${PN} += "${datadir}/licenses ${systemd_user_unitdir} ${nonarch_libdir}/systemd/user-preset/80-fumon.preset"

RDEPENDS:${PN} += "python3-dbus pyxdg python3-core whiptail"
RRECOMMENDS:${PN} += "dbus-broker"
