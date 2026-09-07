SUMMARY = "Qt platform theme plugin integrating Qt applications into Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-integration"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/plasma-integration.git;protocol=https;nobranch=1"
SRCREV = "eeb0f503466582ad7b68d7e7c7dd365411db5696"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    qtwayland \
    extra-cmake-modules \
    kconfig \
    ki18n \
    kiconthemes \
    kio \
    knotifications \
    kwindowsystem \
    kguiaddons \
    kstatusnotifieritem \
    kcolorscheme \
    libxcb \
    wayland \
    wayland-native \
    plasma-wayland-protocols \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_QT5=OFF -DBUILD_QT6=ON"

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig breeze xdg-desktop-portal-kde"
