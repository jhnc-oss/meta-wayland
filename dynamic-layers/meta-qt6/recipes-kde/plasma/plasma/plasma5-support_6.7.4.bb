SUMMARY = "Plasma5Support Framework"
HOMEPAGE = "https://invent.kde.org/plasma/plasma5support"
LICENSE = "CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/plasma/plasma5support.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "782dcfcf3ce811806724b255a5b127d28abcfed4"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kguiaddons \
    ki18n \
    knotifications \
    solid \
    kservice \
    kidletime \
    kio \
    kholidays \
    networkmanager-qt \
    plasma-activities \
    kunitconversion \
"

inherit kf6 gettext pkgconfig

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITH_X11=ON,-DWITH_X11=OFF,libx11"

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig"
