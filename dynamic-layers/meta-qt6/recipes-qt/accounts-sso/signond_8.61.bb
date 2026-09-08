SUMMARY = "Single sign-on daemon of the accounts-sso framework"
HOMEPAGE = "https://gitlab.com/accounts-sso/signond"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI = "git://gitlab.com/accounts-sso/signond.git;protocol=https;branch=master;tag=VERSION_8.61 \
    file://0001-signond-install-does-not-require-superuser-anymore.patch \
    file://0002-Don-t-forward-declare-QStringList.patch \
    file://0003-Remove-usage-of-Q_EXTERN_C.patch \
    file://0004-Port-from-QProcess-pid-to-processId.patch \
    file://0005-Port-away-from-deprecated-QString-SplitBehavior.patch \
    file://0006-Port-away-from-QtContainer-toSet.patch \
    file://0007-Port-away-from-deprecated-QMap-unite.patch \
    file://0008-Use-return-instead-of-reference-for-DBus-output-para.patch \
    file://0009-Adjust-buildsystem-to-include-correct-Qt-Major-versi.patch \
    file://0010-Fix-plugin-datastream-in-Qt6.patch \
    file://0011-Port-away-from-deprecated-QProcess-signal.patch \
"
SRCREV = "5b34c5bbc45eedf55bf553675595b3fcb5c156a8"

DEPENDS = " \
    qtbase \
    libaccounts-qt \
"

inherit qt6-qmake pkgconfig

EXTRA_QMAKEVARS_PRE = "PREFIX=${prefix} LIBDIR=${libdir}"
EXTRA_QMAKEVARS_POST = "SUBDIRS-=tests INSTALLS-=documentation"

do_install:append() {
    rm -f ${D}${libdir}/signon/libexampleplugin.so
    sed -i "s|/usr/include/|\${CMAKE_CURRENT_LIST_DIR}/../../../include/|" ${D}${libdir}/cmake/SignOnQt6/SignOnQt6Config.cmake
}

FILES:${PN} += "${libdir}/signon ${datadir}/dbus-1"
FILES:${PN}-dev += "${libdir}/*.prl"

RDEPENDS:${PN} += "signon-plugin-oauth2"
