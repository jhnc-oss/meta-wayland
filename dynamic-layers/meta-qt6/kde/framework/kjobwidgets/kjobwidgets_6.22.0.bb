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
	python3-shiboken6-native \
	python3-pyside6 \
"

inherit qt6-cmake

CXXFLAGS += "-I${STAGING_INCDIR}/PySide6/KCoreAddons"

FILES:${PN} += "${PYTHON_SITEPACKAGES_DIR} ${datadir}"
