SUMMARY = "This program allows users to configure Qt6 settings (theme, font, icons, etc.)"
HOMEPAGE = "https://github.com/trialuser02/qt6ct"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://COPYING;md5=34e5f07d65fda83802c69040a63390ca"

SRC_URI = "git://www.opencode.net/trialuser/qt6ct;protocol=https;nobranch=1"
SRC_URI += "file://0001-src-qt6ct-qtplugin-CMakeLists.txt-set-plugin-path.patch"
SRC_URI += "file://0001-src-qt6ct-style-CMakeLists.txt-set-plugin-path.patch"
SRCREV = "00823e41aa60e8fe266d5aee328e82ad1ad94348"

DEPENDS = "cmake-native qttools qtbase-native qttools-native"

inherit qt6-cmake

FILES:${PN} += " \
	${libdir}/plugins/platformthemes/libqt6ct.so \
	${libdir}/plugins/styles/libqt6ct-style.so \
"
