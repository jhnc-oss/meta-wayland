SUMMARY = "Convenience classes for D-Bus"
HOMEPAGE = "https://invent.kde.org/frameworks/kdbusaddons"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kdbusaddons.git;protocol=https;nobranch=1"
SRCREV = "dd685f1287979fc4b0576b2f4c2864d5ec7c5d4e"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake

FILES:${PN} += "${datadir}/qlogging-categories6"
