SUMMARY = "wlopm - Wayland output power management"
HOMEPAGE = "https://git.sr.ht/~leon_plickat/wlopm"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "wayland wayland-native wayland-protocols"

inherit bash-completion

SRC_URI = "git://git.sr.ht/~leon_plickat/wlopm;protocol=https;branch=master"
SRCREV = "6a197ebc634a6bc33f8251679bbe15bdd77e2cae"

do_install() {
	oe_runmake 'DESTDIR=${D}' install
}

EXTRA_OEMAKE = "PREFIX=${prefix} SCANNER=${STAGING_BINDIR_NATIVE}/wayland-scanner"
