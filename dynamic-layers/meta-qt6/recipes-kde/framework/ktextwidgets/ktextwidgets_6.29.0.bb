SUMMARY = "Text editing widgets"
HOMEPAGE = "https://invent.kde.org/frameworks/ktextwidgets"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/ktextwidgets.git;protocol=https;nobranch=1"
SRCREV = "6bc8c55b92624a183a3fec57669d42653ba34a73"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcompletion \
    kconfig \
    ki18n \
    kwidgetsaddons \
    sonnet \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
