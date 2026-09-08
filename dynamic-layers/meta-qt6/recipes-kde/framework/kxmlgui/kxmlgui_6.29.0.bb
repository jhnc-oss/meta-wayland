SUMMARY = "Framework for managing menu and toolbar actions"
HOMEPAGE = "https://invent.kde.org/frameworks/kxmlgui"
LICENSE = "BSD-2-Clause AND CC0-1.0 AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/frameworks/kxmlgui.git;protocol=https;nobranch=1"
SRCREV = "d5f07610b0cd78d38fbcb9b4f8b297d80b8d6c2c"

DEPENDS = " \
	clang-native \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	kconfigwidgets \
	kcoreaddons \
	kglobalaccel \
	kitemviews \
	kguiaddons \
	ki18n \
	kiconthemes \
	kwidgetsaddons \
	python3-shiboken6-generator-native \
	python3-pyside6 \
	python3-build-native \
"

inherit kf6 gettext

export LLVM_INSTALL_DIR = "${STAGING_DIR_NATIVE}${prefix_native}"

FILES:${PN} += "${datadir}/qlogging-categories6  ${PYTHON_SITEPACKAGES_DIR}"

RDEPENDS:${PN} += "kconfig"
