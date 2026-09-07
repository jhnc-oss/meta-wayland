SUMMARY = "Platform-independent Qt API for storing passwords securely"
HOMEPAGE = "https://github.com/frankosterfeld/qtkeychain"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=ebece3896618ecf0b60c4fade17f026f"

SRC_URI = "git://github.com/frankosterfeld/qtkeychain.git;protocol=https;nobranch=1"
SRCREV = "aa6da344e1a20b9194e12bace3665caeea6b6304"

DEPENDS = " \
    qtbase \
    qttools-native \
    libsecret \
"

inherit qt6-cmake

EXTRA_OECMAKE += " \
    -DBUILD_WITH_QT6=ON \
    -DBUILD_TEST_APPLICATION=OFF \
    -DBUILD_QTQUICK_DEMO=OFF \
    -DECM_MKSPECS_INSTALL_DIR=${QT6_INSTALL_MKSPECSDIR}/modules \
"

FILES:${PN} += "${datadir}"
FILES:${PN}-dev += "${QT6_INSTALL_MKSPECSDIR}"
