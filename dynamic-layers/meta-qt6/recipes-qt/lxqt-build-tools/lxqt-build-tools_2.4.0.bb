SUMMARY = "CMake modules and helper scripts shared by the LXQt projects"
HOMEPAGE = "https://github.com/lxqt/lxqt-build-tools"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://BSD-3-Clause;md5=a8987c1fd6930fe14ae46b4d72e53770"

SRC_URI = "git://github.com/lxqt/lxqt-build-tools.git;protocol=https;nobranch=1;tag=2.4.0"
SRCREV = "0f56cd400d2afcb6f16d4ca88538ed716439c2c2"

DEPENDS = "qtbase"

inherit qt6-cmake

FILES:${PN} += "${datadir}/cmake"
