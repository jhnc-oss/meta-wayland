SUMMARY = "Modern text editor built on the KDE Frameworks and Qt"
HOMEPAGE = "https://invent.kde.org/utilities/kate"
LICENSE = "CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/utilities/kate.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "f4c3ee85ec006dca2a8e9a740be031fade9c7c38"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kguiaddons \
    ki18n \
    ktexteditor \
    kcrash \
    kiconthemes \
"

inherit kf6 gettext mime mime-xdg

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "bash kconfig"
