SUMMARY = "Qt wrapper for ModemManager DBus API"
HOMEPAGE = "https://invent.kde.org/frameworks/modemmanager-qt"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-3.0-only AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/frameworks/modemmanager-qt.git;protocol=https;nobranch=1"
SRCREV = "452035217ae118c72a17eff5afa6a9fc198500cd"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    modemmanager \
"

inherit qt6-cmake pkgconfig

do_install:append() {
    sed -i "s:${STAGING_INCDIR}:\${_IMPORT_PREFIX}/include:" ${D}${libdir}/cmake/KF6ModemManagerQt/KF6ModemManagerQtTargets.cmake
}

FILES:${PN} += "${libdir}/qml  ${datadir}"
