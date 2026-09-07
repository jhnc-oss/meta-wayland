SUMMARY = "Aurorae is a themeable window decoration for KWin"
HOMEPAGE = "https://invent.kde.org/plasma/aurorae"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/plasma/aurorae.git;protocol=https;nobranch=1"
SRCREV = "3425c1cfc1fed00129a85b0461b6b6805cfd1835"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    ksvg \
    kcolorscheme \
    ki18n \
    kpackage \
    kcmutils \
    knewstuff \
    kdecoration \
"

inherit kf6 gettext

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "bash kconfig kpackage"
