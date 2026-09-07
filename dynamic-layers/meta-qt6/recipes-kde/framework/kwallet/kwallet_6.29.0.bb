SUMMARY = "Safe desktop-wide storage for passwords"
HOMEPAGE = "https://invent.kde.org/frameworks/kwallet"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kwallet.git;protocol=https;nobranch=1"
SRCREV = "5b54d22174cf8f31cebd2bc6e83096beedbbe738"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	kcoreaddons \
	ki18n \
	kwindowsystem \
	knotifications \
	kwidgetsaddons \
	kcolorscheme \
	kdbusaddons \
	kcrash \
	qca \
	libsecret \
"

inherit kf6 gettext pkgconfig

# ksecret daemon build requires qt5
EXTRA_OECMAKE += "-DOE_QCA_PATH_HOST_ROOT=${STAGING_DIR_HOST} -DBUILD_KSECRETD=OFF"

FILES:${PN} += "${datadir}"
