SUMMARY = "Printer management for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/print-manager"
LICENSE = "BSD-3-Clause AND GPL-2.0-or-later AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/plasma/print-manager.git;protocol=https;nobranch=1"
SRCREV = "a0c4a3bba4871c243d7d79bacda22bbc50e1466f"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kdbusaddons \
    ki18n \
    kcmutils \
    kirigami \
    kirigami-addons \
    kitemmodels \
    kdeclarative \
    kio \
    knotifications \
    kwidgetsaddons \
    kwindowsystem \
    libplasma \
    cups \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DSCP_INSTALL=OFF \
    -DCMAKE_DISABLE_FIND_PACKAGE_PackageKitQt6=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_CupsSmb=ON \
"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${libdir}/libkcups.so ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig kpackage kirigami-addons kitemmodels kdeclarative cups cups-pk-helper"

INSANE_SKIP:${PN} = "dev-so"
