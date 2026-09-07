SUMMARY = "Powerful completion framework, including completion-enabled lineedit and combobox"
HOMEPAGE = "https://invent.kde.org/frameworks/kcompletion"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kcompletion.git;protocol=https;nobranch=1"
SRCREV = "03c713c0e8d358d25bb2d39c6af6d1cfc03558be"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kcodecs \
	kconfig \
	kwidgetsaddons \
"

inherit kf6 pkgconfig

FILES:${PN} += "${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
