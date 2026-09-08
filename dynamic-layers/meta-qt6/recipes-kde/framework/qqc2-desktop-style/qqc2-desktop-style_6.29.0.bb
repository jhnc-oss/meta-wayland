SUMMARY = "This is a style for Qt Quick Controls which uses the application's QStyle"
HOMEPAGE = "https://invent.kde.org/frameworks/qqc2-desktop-style"
LICENSE = "CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-or-later AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL AND LicenseRef-KFQF-Accepted-GPL AND LicenseRef-Qt-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/LicenseRef-KFQF-Accepted-GPL.txt;md5=78da933b59d9c7bc6724ff236ca1652d \
    file://LICENSES/LicenseRef-Qt-Commercial.txt;md5=df490d93422a5e93c436cdb31a6c4e74 \
"

SRC_URI = "git://invent.kde.org/frameworks/qqc2-desktop-style.git;protocol=https;nobranch=1"
SRCREV = "3838e6b0b19b63434edbca25b130f06a1b7f4f21"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kiconthemes \
	kcolorscheme \
	kirigami \
"

inherit kf6

FILES:${PN} += "${libdir}/qml ${libdir}/plugins"

RDEPENDS:${PN} = "kconfig"
