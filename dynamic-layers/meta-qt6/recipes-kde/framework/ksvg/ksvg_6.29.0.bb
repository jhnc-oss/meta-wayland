SUMMARY = "A library for rendering SVG-based themes with stylesheet re-coloring and on-disk caching"
HOMEPAGE = "https://invent.kde.org/frameworks/ksvg"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/frameworks/ksvg.git;protocol=https;nobranch=1"
SRCREV = "d7cc8c0bfffe058b2b669da7cf4a83ccb44d20f8"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    karchive \
    kcolorscheme \
    kguiaddons \
    kirigami \
"

inherit kf6 gettext

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
