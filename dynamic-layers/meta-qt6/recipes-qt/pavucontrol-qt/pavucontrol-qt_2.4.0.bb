SUMMARY = "Qt port of the PulseAudio volume control pavucontrol"
HOMEPAGE = "https://github.com/lxqt/pavucontrol-qt"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://github.com/lxqt/pavucontrol-qt.git;protocol=https;nobranch=1;tag=2.4.0"
SRCREV = "a7e7fa080fe23a0d81d3e09aa513ed7d9bf92a38"

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
