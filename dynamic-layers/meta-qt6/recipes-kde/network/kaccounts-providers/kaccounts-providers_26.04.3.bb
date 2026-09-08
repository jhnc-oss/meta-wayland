SUMMARY = "Online account providers and services for KDE"
HOMEPAGE = "https://invent.kde.org/network/kaccounts-providers"
LICENSE = "GPL-2.0-or-later AND GPL-3.0-or-later AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/network/kaccounts-providers.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "0f2f478c079bfee065f7000a9dde10b78aba18db"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kaccounts-integration \
    ki18n \
    kio \
    kpackage \
    qcoro \
"

inherit kf6 gettext pkgconfig

PACKAGECONFIG ??= "${@bb.utils.contains('QTWEBENGINE_SUPPORTED', '1', 'webengine', '', d)}"
PACKAGECONFIG[webengine] = "-DCMAKE_DISABLE_FIND_PACKAGE_Qt6WebEngineQuick=OFF,-DCMAKE_DISABLE_FIND_PACKAGE_Qt6WebEngineQuick=ON,qtwebengine"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

do_install:append() {
    rm -f ${D}${datadir}/accounts/providers/kde/google.provider
    rm -rf ${D}${sysconfdir}/signon-ui
}

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kaccounts-integration kirigami"
