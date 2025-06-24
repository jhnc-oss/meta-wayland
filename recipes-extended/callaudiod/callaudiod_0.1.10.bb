SUMMARY = "callaudiod is a daemon for dealing with audio routing during phone calls."
HOMEPAGE = "https://gitlab.com/mobian1/callaudiod"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "glib-2.0 alsa-lib pulseaudio"
RDEPENDS:${PN} += "pulseaudio-server"

inherit meson pkgconfig

SRC_URI = "git://gitlab.com/mobian1/callaudiod.git;protocol=https;branch=master"

SRCREV = "56831297817afb6b30062b7cee3e40225ac39cac"

FILES:${PN} += "${datadir}"

