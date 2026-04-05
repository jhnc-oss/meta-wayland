SUMMARY = "callaudiod is a daemon for dealing with audio routing during phone calls."
HOMEPAGE = "https://gitlab.com/mobian1/callaudiod"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "appstream glib-2.0 alsa-lib pulseaudio"
RDEPENDS:${PN} += "pulseaudio-server"

inherit meson pkgconfig

SRC_URI = "git://gitlab.com/mobian1/callaudiod.git;protocol=https;branch=master"

SRCREV = "8d262597f41ff787359059ec6a15acd48b7433f6"

FILES:${PN} += "${datadir}"

