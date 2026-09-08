SUMMARY = "Qt bindings for libaccounts-glib"
HOMEPAGE = "https://gitlab.com/accounts-sso/libaccounts-qt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI = "git://gitlab.com/accounts-sso/libaccounts-qt.git;protocol=https;branch=master;tag=VERSION_1.17"
SRCREV = "c8fdd05f1a1ff5886f4649d24f2ba8c5f61cfa3a"

DEPENDS = " \
    qtbase \
    libaccounts-glib \
"

inherit qt6-qmake pkgconfig

EXTRA_QMAKEVARS_PRE = "PREFIX=${prefix} LIBDIR=${libdir}"
EXTRA_QMAKEVARS_POST = "SUBDIRS-=tests INSTALLS-=documentation"

do_install:append() {
    sed -i "s|/usr/include/|\${CMAKE_CURRENT_LIST_DIR}/../../../include/|" ${D}${libdir}/cmake/AccountsQt6/AccountsQt6Config.cmake
}

FILES:${PN}-dev += "${libdir}/*.prl"
