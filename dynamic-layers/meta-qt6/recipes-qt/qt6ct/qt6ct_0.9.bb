SUMMARY = "This program allows users to configure Qt6 settings (theme, font, icons, etc.)"
HOMEPAGE = "https://github.com/trialuser02/qt6ct"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://COPYING;md5=d1f6db91e8b388803991385a2c6d75f5"

SRC_URI = "git://github.com/trialuser02/qt6ct.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-src-qt6ct-qtplugin-CMakeLists.txt-set-plugin-path.patch"
SRC_URI += "file://0001-src-qt6ct-style-CMakeLists.txt-set-plugin-path.patch"
SRCREV = "55dba8704c0a748b0ce9f2d3cc2cf200ca3db464"

DEPENDS = "cmake-native qttools qtbase-native qttools-native"

inherit qt6-cmake

FILES:${PN} += " \
	${libdir}/plugins/platformthemes/libqt6ct.so \
	${libdir}/plugins/styles/libqt6ct-style.so \
"
