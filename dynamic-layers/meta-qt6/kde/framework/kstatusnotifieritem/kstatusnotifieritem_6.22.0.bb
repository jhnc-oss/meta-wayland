SUMMARY = "KDE Status Notifier Item Protocol Implementation"
HOMEPAGE = "https://invent.kde.org/frameworks/kstatusnotifieritem"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404"

SRC_URI = "git://invent.kde.org/frameworks/kstatusnotifieritem.git;protocol=https;nobranch=1"
SRCREV = "6b5a8512ddb04d219c784abb01b0febc8a21891a"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kwindowsystem \
	dbus \
	python3-shiboken6-native \
	python3-pyside6 \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DWITHOUT_X11=ON"
FILES:${PN} += "${datadir} ${PYTHON_SITEPACKAGES_DIR}"
