SUMMARY = "Framework for collecting feedback from application users via telemetry and targeted surveys"
HOMEPAGE = "https://invent.kde.org/frameworks/kuserfeedback"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kuserfeedback.git;protocol=https;nobranch=1"
SRCREV = "2611c9b6eba8488c6fd619472ec312b8744f7440"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
"

inherit qt6-cmake

PACKAGECONFIG ?= ""
PACKAGECONFIG[php] = "-DENABLE_PHP=ON -DENABLE_PHP_UNIT=ON,-DENABLE_PHP=OFF -DENABLE_PHP_UNIT=OFF,php"
PACKAGECONFIG[console] = "-DENABLE_CONSOLE=ON,-DENABLE_CONSOLE=OFF"

FILES:${PN} += "${prefix}/mkspecs ${libdir}/qml ${datadir}/qlogging-categories6"
