SUMMARY = "Wraps standalone Wayland compositors into a set of Systemd units on the fly"
HOMEPAGE = "https://github.com/Vladimir-csp/uwsm"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0bcdc63de832340797303f320ae6af32"

inherit meson pkgconfig

EXTRA_OEMESON = "-Dpython-bin=${bindir}/python3"

SRC_URI = " \
	git://github.com/Vladimir-csp/uwsm.git;protocol=https;branch=master \
	file://0001-uwsm-meson.build-dont-fail-for-missing-python-module.patch \
"
SRCREV = "46f81e90d1f2554ae1ce98370817cce7be164981"
PV = "0.20.4"

S = "${WORKDIR}/git"

PACKAGECONFIG ?= "man-pages uuctl"
PACKAGECONFIG[man-pages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"
PACKAGECONFIG[uuctl] = "-Duuctl=enabled,-Duuctl=disabled,,libnewt"

FILES:${PN} += "${datadir}/licenses"

RDEPENDS:${PN} = "python3-dbus pyxdg python3-core"
RRECOMMENDS:${PN} = "dbus-broker"
