SUMMARY = "Widgets for showing progress of asynchronous jobs"
HOMEPAGE = "https://invent.kde.org/frameworks/kjobwidgets"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kjobwidgets.git;protocol=https;nobranch=1"
SRCREV = "7127a083a2484484c95bfc3c6f839634b2a19ccc"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kcoreaddons \
	kwidgetaddons \
	knotifications \
"

inherit qt6-cmake

EXTRA_OECMAKE += "-DBUILD_PYTHON_BINDINGS=OFF"

FILES:${PN} += "${datadir}"
