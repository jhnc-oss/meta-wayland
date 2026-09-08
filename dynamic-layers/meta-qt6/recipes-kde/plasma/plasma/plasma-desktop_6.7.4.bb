SUMMARY = "Plasma for the desktop form factor"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-desktop"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GFDL-1.2-or-later AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND LicenseRef-synaptics AND Unicode-DFS-2016"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9f58808219e9a42ff1228309d6f83dc6 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/LicenseRef-synaptics.txt;md5=5fd361e0fb2e03d164d4cb7c60acf436 \
    file://LICENSES/Unicode-DFS-2016.txt;md5=daf288399a5d03ddccd02a70c48cfbce \
"

SRC_URI = "git://invent.kde.org/plasma/plasma-desktop.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-CMakeLists.txt-make-ksysguard-optional.patch"
SRCREV = "95e51519c44e6bc4aeee0cce998aba244fcd68f4"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
    qt5compat \
    qtshadertools \
    qtsvg \
    kauth \
    kcrash \
    kconfig \
    ki18n \
    kcmutils \
    knewstuff \
    kio \
    knotifications \
    knotifyconfig \
    attica \
    krunner \
    kglobalaccel \
    kcoreaddons \
    kguiaddons \
    kdbusaddons \
    kdoctools \
    kdoctools-native \
    kwidgetsaddons \
    kcodecs \
    sonnet \
    kpackage \
    kiconthemes \
    kxmlgui \
    ksvg \
    libplasma \
    libxkbfile \
    plasma-activities \
    plasma-activities-stats \
    plasma5-support \
    plasma-workspace \
    kirigami \
    libcanberra \
    wayland \
    wayland-native \
    wayland-protocols \
    libwacom \
    virtual/libsdl2 \
    xdg-user-dirs \
    systemsettings \
"

inherit kf6 gettext pkgconfig

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = ",-DCMAKE_DISABLE_FIND_PACKAGE_X11=ON,libx11 libxcb xcb-util-image"

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF -DBUILD_KCM_MOUSE_X11=OFF -DBUILD_KCM_TOUCHPAD_X11=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig kwin"

INSANE_SKIP:${PN} = "dev-so"
