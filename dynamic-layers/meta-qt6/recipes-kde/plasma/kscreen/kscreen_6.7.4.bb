SUMMARY = "KScreen is the screen management software for KDE Plasma Workspaces"
HOMEPAGE = "https://invent.kde.org/plasma/kscreen"
LICENSE = "CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-or-later AND LicenseRef-KDE-Accepted-GPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
"

SRC_URI = "git://invent.kde.org/plasma/kscreen.git;protocol=https;nobranch=1"
SRCREV = "d8d71db5e2f5ac25e3de75d0476b7701b7cbaea8"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    qt5compat \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kdbusaddons \
    ki18n \
    kitemmodels \
    kcmutils \
    ksvg \
    kxmlgui \
    kcrash \
    kimageformats \
    libplasma \
    plasma5-support \
    libkscreen \
    layer-shell-qt \
    wayland-protocols \
    wayland \
    wayland-native \
"

inherit kf6 gettext

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITH_X11=ON,-DWITH_X11=OFF,libx11 libxcb xcb-util"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig"

CXXFLAGS += "-Wno-unused-result"
