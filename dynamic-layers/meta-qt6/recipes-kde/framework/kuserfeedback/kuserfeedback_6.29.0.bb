SUMMARY = "Framework for collecting feedback from application users via telemetry and targeted surveys"
HOMEPAGE = "https://invent.kde.org/frameworks/kuserfeedback"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/frameworks/kuserfeedback.git;protocol=https;nobranch=1"
SRCREV = "83c5379140635eab595d4ca3f1513055dc63aeb9"

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
