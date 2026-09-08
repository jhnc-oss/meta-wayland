SUMMARY = "Core components for the KDE Activity concept"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-activities"
LICENSE = "CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/plasma/plasma-activities.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "8470fabe764d2918a426b07e1dbb89fdabfdb99c"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
"

inherit kf6

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
