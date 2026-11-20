SUMMARY = "Event sound library with the libcanberra API, played through PipeWire"
HOMEPAGE = "https://github.com/MarkusVolk/canberra-pipewire"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://LICENSES/LGPL-2.1-or-later.txt;md5=2d5025d4aa3495befef8f17206a5b0a1"

SRC_URI = "git://github.com/MarkusVolk/canberra-pipewire.git;protocol=https;branch=main"
SRCREV = "3844e7a0af85fb7cf7b82a0fdf0924b0c7a1e5d6"

DEPENDS = "pipewire libsndfile1"

inherit meson pkgconfig

EXTRA_OEMESON = "-Dtests=false"

PROVIDES = "libcanberra"

PACKAGES =+ "${PN}-tools"
FILES:${PN}-tools = "${bindir}"
FILES:${PN}-dev += "${datadir}/vala"

RPROVIDES:${PN} = "libcanberra"
RREPLACES:${PN} = "libcanberra"
RCONFLICTS:${PN} = "libcanberra"
RRECOMMENDS:${PN} = "sound-theme-freedesktop"
