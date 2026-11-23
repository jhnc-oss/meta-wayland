SUMMARY = "mpv-mpris is a plugin for mpv which allows control of the player using standard media keys"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d9f933220f595813218a175adc13001"

SRC_URI = "git://github.com/hoyon/mpv-mpris.git;protocol=https;branch=master;tag=${PV}"
SRCREV = "de552ae185399073b4fbc8557fa64c9543cdcf9f"

DEPENDS += "ffmpeg glib-2.0 mpv"

inherit pkgconfig

do_install() {
	oe_runmake PREFIX=${prefix} DESTDIR=${D} install
}

INSANE_SKIP:${PN} = "dev-so"

EXCLUDE_FROM_WORLD = "${@bb.utils.contains("LICENSE_FLAGS_ACCEPTED", "commercial", "0", "1", d)}"

RDEPENDS:${PN} = "playerctl"
