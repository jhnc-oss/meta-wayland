SUMMARY = "Modern text editor built on the KDE Frameworks and Qt"
HOMEPAGE = "https://invent.kde.org/utilities/kate"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/utilities/kate.git;protocol=https;nobranch=1"
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
