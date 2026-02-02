SUMMARY = "String encoding library"
HOMEPAGE = "https://invent.kde.org/frameworks/kcodecs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kcodecs.git;protocol=https;nobranch=1"
SRCREV = "13c53eb2b30c89da3a0c74b9446ec82669036d11"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake pkgconfig

FILES:${PN} += "${datadir}/qlogging-categories6"
