SUMMARY = "Safe desktop-wide storage for passwords"
HOMEPAGE = "https://invent.kde.org/frameworks/kwallet"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-or-later AND LGPL-3.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

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
