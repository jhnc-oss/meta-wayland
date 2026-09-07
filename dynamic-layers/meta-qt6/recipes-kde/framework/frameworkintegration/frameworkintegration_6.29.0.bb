SUMMARY = "Integration of Qt application with KDE workspaces"
HOMEPAGE = "https://invent.kde.org/frameworks/frameworkintegration"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/frameworkintegration.git;protocol=https;nobranch=1"
SRCREV = "482e194a9b4ff07086a26c28cbab3660b6b6c6ee"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kwidgetsaddons \
    kconfig \
    kcoreaddons \
    kcolorscheme \
    kiconthemes \
    knotifications \
    kpackage \
    ki18n \
    knewstuff \
"

inherit kf6 gettext

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${datadir}"

