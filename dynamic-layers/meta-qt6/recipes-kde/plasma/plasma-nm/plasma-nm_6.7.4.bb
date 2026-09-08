SUMMARY = "Plasma applet and KCM for managing network connections through NetworkManager"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-nm"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/plasma/plasma-nm.git;protocol=https;nobranch=1"
SRCREV = "b6c03fe24b30d2a963a41dd83784e36086d7257e"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kcolorscheme \
    kcompletion \
    kcoreaddons \
    kdbusaddons \
    kio \
    ki18n \
    kjobwidgets \
    networkmanager-qt \
    modemmanager-qt \
    knotifications \
    kservice \
    solid \
    kwidgetsaddons \
    kwindowsystem \
    kcmutils \
    ksvg \
    kirigami \
    kirigami-addons \
    prison \
    kquickcharts \
    libplasma \
    qtkeychain \
    qcoro \
    openssl \
    networkmanager \
"

inherit kf6 gettext pkgconfig mime-xdg

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_OPENCONNECT=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${libdir}/libplasmanm_*.so ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig kpackage kirigami-addons kquickcharts networkmanager"

INSANE_SKIP:${PN} = "dev-so"
