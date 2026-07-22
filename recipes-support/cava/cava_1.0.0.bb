SUMMARY = "Cross-platform Audio Visualizer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6eea703700f068b569f924b80fadf6da"

SRC_URI = "git://github.com/karlstav/cava.git;protocol=https;branch=master"
SRCREV = "4b12c2b043723f42567ddbfd5a516566bdf52316"
PV .= "+git"

DEPENDS = "fftw pipewire alsa-lib virtual/libsdl2 iniparser virtual/libgl pipewire pulseaudio ncurses"

inherit cmake pkgconfig

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${B}/cava ${D}${bindir}
}

RDEPENDS:${PN} = "ncurses-tools"
