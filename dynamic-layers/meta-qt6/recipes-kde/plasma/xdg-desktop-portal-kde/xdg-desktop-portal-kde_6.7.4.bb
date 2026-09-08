SUMMARY = "A backend implementation for xdg-desktop-portal that is using Qt/KF"
HOMEPAGE = "https://invent.kde.org/plasma/xdg-desktop-portal-kde"
LICENSE = "BSD-2-Clause AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
"

SRC_URI = "git://invent.kde.org/plasma/xdg-desktop-portal-kde.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "cc3074c811a171ef910b1210214cbd9452e966aa"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kcoreaddons \
    kconfig \
    ki18n \
    kguiaddons \
    kglobalaccel \
    kio \
    kio-fuse \
    kirigami \
    knotifications \
    kservice \
    kwidgetsaddons \
    kwindowsystem \
    kiconthemes \
    kstatusnotifieritem \
    kcrash \
    kwayland \
    wayland \
    wayland-native \
    wayland-protocols \
    plasma-wayland-protocols \
    libxkbcommon \
"

inherit kf6 gettext

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig xdg-desktop-portal"
