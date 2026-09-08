SUMMARY = "System service that keeps track of the Plasma activities"
HOMEPAGE = "https://invent.kde.org/plasma/kactivitymanagerd"
LICENSE = "CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/plasma/kactivitymanagerd.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "be5a82c270a1623244c40c422d70081d56f73ce4"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    boost \
    kconfig \
    kcrash \
    kdbusaddons \
    kglobalaccel \
    ki18n \
    kio \
    kwindowsystem \
    kxmlgui \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/libkactivitymanagerd_plugin.so ${datadir} ${systemd_user_unitdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig qtbase-plugins"
