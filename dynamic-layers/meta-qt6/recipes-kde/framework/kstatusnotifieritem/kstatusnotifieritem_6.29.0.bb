SUMMARY = "KDE Status Notifier Item Protocol Implementation"
HOMEPAGE = "https://invent.kde.org/frameworks/kstatusnotifieritem"
LICENSE = "CC0-1.0 AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404 \
"

SRC_URI = "git://invent.kde.org/frameworks/kstatusnotifieritem.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "e995a4320e563eb553cd169eb74aaf9d6293587b"

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

export LLVM_INSTALL_DIR = "${STAGING_DIR_NATIVE}${prefix_native}"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITHOUT_X11=OFF,-DWITHOUT_X11=ON,libx11"
FILES:${PN} += "${datadir} ${PYTHON_SITEPACKAGES_DIR}"
