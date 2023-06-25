SUMMARY = "callaudiod is a daemon for dealing with audio routing during phone calls."
HOMEPAGE = "https://gitlab.com/mobian1/callaudiod"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "glib-2.0 alsa-lib pulseaudio"
RDEPENDS:${PN} += "pulseaudio-server"

inherit meson pkgconfig

SRC_URI = "git://gitlab.com/mobian1/callaudiod.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "0.1.9"
SRCREV = "50d1ac3792aac03abe0a3a88ceac77201a43bb3b"

FILES:${PN} += "${datadir}"

