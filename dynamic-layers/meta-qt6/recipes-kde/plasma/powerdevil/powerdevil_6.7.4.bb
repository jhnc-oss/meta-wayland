SUMMARY = "Power management daemon, KCM and applets for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/powerdevil"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND GPL-3.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/GPL-3.0-or-later.txt;md5=75d892af193fd5a298f724c4377d8f62 \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=f84bf0be7e692fb13c86c88da0c7d472 \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
"

SRC_URI = "git://invent.kde.org/plasma/powerdevil.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "7c97bbcd0e90ccb43eca1debd36191fc97f9f987"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    qtwayland \
    extra-cmake-modules \
    kauth \
    kconfig \
    kcrash \
    kdbusaddons \
    ki18n \
    kidletime \
    kitemmodels \
    kglobalaccel \
    kio \
    kirigami \
    kcmutils \
    knotifications \
    krunner \
    solid \
    kwindowsystem \
    kxmlgui \
    libplasma \
    plasma-activities \
    libkscreen \
    plasma-workspace \
    qcoro \
    udev \
    libxcb \
    plasma-wayland-protocols \
    wayland \
    wayland-native \
"

inherit kf6 gettext pkgconfig

PACKAGECONFIG ?= "ddcutil"
PACKAGECONFIG[ddcutil] = ",-DCMAKE_DISABLE_FIND_PACKAGE_DDCUtil=ON,ddcutil"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DCMAKE_DISABLE_FIND_PACKAGE_KF6DocTools=ON"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig kpackage"
RRECOMMENDS:${PN} += "upower power-profiles-daemon"

INSANE_SKIP:${PN} = "dev-so"
