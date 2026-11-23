SUMMARY = "Qt port of the PulseAudio volume control pavucontrol"
HOMEPAGE = "https://github.com/lxqt/pavucontrol-qt"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=16b655a8bac585a2efe264a3e1853310"

SRC_URI = "git://github.com/lxqt/pavucontrol-qt.git;protocol=https;nobranch=1;tag=${PV}"
SRCREV = "c12e4ac5252c10f1ce2f175a42c93c7697c3cb87"

DEPENDS = " \
    qtbase \
    qttools-native \
    lxqt-build-tools \
    glib-2.0 \
    pulseaudio \
"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${datadir}"

RRECOMMENDS:${PN} += "pipewire-pulse"
