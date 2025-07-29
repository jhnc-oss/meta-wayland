SUMMARY = "Cross-platform Audio Visualizer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6eea703700f068b569f924b80fadf6da"

SRC_URI = "git://github.com/karlstav/cava.git;protocol=https;branch=master"
SRC_URI += "file://0001-configure.ac-fix-crosscompile.patch"
SRCREV = "a6cd68e26447770a1526021d709f27b26d08df80"

DEPENDS = "fftw pipewire alsa-lib virtual/libsdl2 iniparser virtual/libgl ncurses autoconf-native autoconf-archive-native"

inherit autotools-brokensep pkgconfig

do_configure:prepend() {
	echo ${PV} > ${S}/version # hard coded version
	cd ${S} && autoreconf -vif
}

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} = "ncurses-tools"
