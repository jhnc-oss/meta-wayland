SUMMARY = "Qt platform theme plugin integrating Qt applications into Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-integration"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL AND LicenseRef-KFQF-Accepted-GPL AND LicenseRef-Qt-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/LicenseRef-KFQF-Accepted-GPL.txt;md5=78da933b59d9c7bc6724ff236ca1652d \
    file://LICENSES/LicenseRef-Qt-Commercial.txt;md5=df490d93422a5e93c436cdb31a6c4e74 \
"

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
