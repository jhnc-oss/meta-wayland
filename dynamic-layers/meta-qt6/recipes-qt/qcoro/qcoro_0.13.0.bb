SUMMARY = "cpptrace is a simple and portable C++ stacktrace library supporting C++11 and greater"
HOMEPAGE = "https://github.com/qcoro/qcoro"
LICENSE = "MIT"
LIC_FILES_CHKSUM += "file://LICENSE;md5=380f1e4dae9580cea509410524d5165d"

SRC_URI = "git://github.com/qcoro/qcoro.git;protocol=https;nobranch=1"
SRCREV = "98f23d8d8d67e9e24217d268927faec97c713fb0"

DEPENDS = "qtbase qttools-native qtwebsockets"

inherit qt6-cmake

EXTRA_OECMAKE += "-DQCORO_BUILD_EXAMPLES=OFF -DBUILD_TESTING=OFF"

FILES:${PN} += "${prefix}/mkspecs"


