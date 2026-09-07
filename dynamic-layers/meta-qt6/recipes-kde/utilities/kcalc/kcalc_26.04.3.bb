SUMMARY = "Scientific calculator"
HOMEPAGE = "https://invent.kde.org/utilities/kcalc"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/utilities/kcalc.git;protocol=https;nobranch=1"
SRCREV = "b5901a0b8632e9c8c9014886ffe2f75e1b302fb5"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kcrash \
    kcolorscheme \
    kconfigwidgets \
    kguiaddons \
    ki18n \
    kiconthemes \
    knotifications \
    kxmlgui \
    gmp \
    mpfr \
    libmpc \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DCMAKE_DISABLE_FIND_PACKAGE_KF6DocTools=ON"

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} += "kconfig"
