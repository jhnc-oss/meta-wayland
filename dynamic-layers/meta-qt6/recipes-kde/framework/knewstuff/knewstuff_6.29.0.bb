SUMMARY = "Framework for downloading and sharing additional application data"
HOMEPAGE = "https://invent.kde.org/frameworks/knewstuff"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9"

SRC_URI = "git://invent.kde.org/frameworks/knewstuff.git;protocol=https;nobranch=1"
SRCREV = "7326d7b2d03ef0cbf1daa726403c579564db0a1b"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	karchive \
	kcoreaddons \
	kwidgetsaddons \
	kpackage \
	attica \
"

inherit kf6 pkgconfig gettext

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}/qlogging-categories6"
