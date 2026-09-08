SUMMARY = "Integration of QML and KDE work spaces"
HOMEPAGE = "https://invent.kde.org/frameworks/kdeclarative"
LICENSE = "CC0-1.0 AND GPL-2.0-only AND GPL-3.0-only AND LGPL-2.0-or-later AND LGPL-2.1-or-later AND LicenseRef-KDE-Accepted-GPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/frameworks/kdeclarative.git;protocol=https;nobranch=1;tag=v6.29.0"
SRCREV = "2d8a19adf76f7d253f326ae9c7d3d74dc1d0f71d"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n\
    kconfig \
    kguiaddons \
    kglobalaccel \
    kwidgetsaddons \
"

inherit kf6 gettext

FILES:${PN} += "${libdir}/qml ${datadir}"

RDEPENDS:${PN} += "kconfig"

