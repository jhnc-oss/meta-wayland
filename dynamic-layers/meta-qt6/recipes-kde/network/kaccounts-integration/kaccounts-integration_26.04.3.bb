SUMMARY = "System settings module, kded module and library for KDE online accounts"
HOMEPAGE = "https://invent.kde.org/network/kaccounts-integration"
LICENSE = "GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-or-later AND LicenseRef-KDE-Accepted-GPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
"

SRC_URI = "git://invent.kde.org/network/kaccounts-integration.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "527871c1494582acf20c235d305548ad4c489570"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kcmutils \
    kcoreaddons \
    kdbusaddons \
    ki18n \
    kio \
    kwallet \
    libaccounts-qt \
    signond \
    qcoro \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

do_install:append() {
    sed -i "s|${STAGING_DIR_HOST}${libdir}/cmake/AccountsQt6/../../../include/accounts-qt6/|\${_IMPORT_PREFIX}/include/accounts-qt6|g" ${D}${libdir}/cmake/KAccounts6/KAccounts6Targets.cmake
}

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake ${libdir}/lib*.so"

RDEPENDS:${PN} += "kcmutils kirigami signond"
