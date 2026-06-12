SUMMARY = "KDE Status Notifier Item Protocol Implementation"
HOMEPAGE = "https://invent.kde.org/frameworks/kstatusnotifieritem"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404"

SRC_URI = "git://invent.kde.org/frameworks/kstatusnotifieritem.git;protocol=https;nobranch=1"
SRCREV = "2da05e5865d6f84094efca06595bc5dff97afc53"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kwindowsystem \
	dbus \
	python3-shiboken6-generator-native \
	python3-pyside6 \
"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DWITHOUT_X11=ON"
FILES:${PN} += "${datadir} ${PYTHON_SITEPACKAGES_DIR}"
