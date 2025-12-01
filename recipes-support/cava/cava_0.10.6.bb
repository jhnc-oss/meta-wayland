SUMMARY = "Cross-platform Audio Visualizer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6eea703700f068b569f924b80fadf6da"

SRC_URI = "git://github.com/karlstav/cava.git;protocol=https;branch=master"
SRC_URI += "file://0001-configure.ac-fix-find-iniparser.patch"
SRCREV = "aca02dd36b01fc79beea9b436ca62c371e546d86"

DEPENDS = "fftw pipewire alsa-lib virtual/libsdl2 iniparser virtual/libgl autoconf-native autoconf-archive-native"

inherit autotools-brokensep pkgconfig

do_configure:prepend() {
	echo ${PV} > ${S}/version # hard coded version
	cd ${S} && autoreconf -vif
}

EXTRA_OECONF = "--disable-output-ncurses"

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} = "ncurses-tools"
