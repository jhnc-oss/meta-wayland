SUMMARY = "mpv-mpris is a plugin for mpv which allows control of the player using standard media keys"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d9f933220f595813218a175adc13001"

SRC_URI = "git://github.com/hoyon/mpv-mpris.git;protocol=https;branch=master"
SRCREV = "df95f07c48926d1589ee5fe36a455c1f49cbe4c8"

DEPENDS += "ffmpeg mpv"

inherit pkgconfig

do_install() {
	oe_runmake PREFIX=${prefix} DESTDIR=${D} install
}

INSANE_SKIP:${PN} = "dev-so"

RDEPENDS:${PN} = "playerctl"
