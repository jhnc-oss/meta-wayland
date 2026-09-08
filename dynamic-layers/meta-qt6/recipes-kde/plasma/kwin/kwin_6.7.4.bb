SUMMARY = "KWin is an easy to use, but flexible, compositor for Wayland on Linux"
HOMEPAGE = "https://invent.kde.org/plasma/kwin"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND GPL-3.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/plasma/kwin.git;protocol=https;nobranch=1"
SRCREV = "8438567a741826da8b7536a8b10eb3af8fc8820d"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d-native \
    qtdeclarative \
    qtsensors \
    qtsvg \
    qt5compat \
    extra-cmake-modules \
    kdeclarative \
    kauth \
    kcrash \
    kcmutils \
    ki18n \
    kservice \
    kwidgetsaddons \
    kwindowsystem \
    kdbusaddons \
    kguiaddons \
    kidletime \
    ksvg \
    kpackage \
    kglobalaccel \
    plasma-activities \
    knewstuff \
    kxmlgui \
    knighttime \
    kwayland \
    kpipewire \
    plasma-activities \
    kirigami \
    libplasma \
    kdecoration \
    breeze \
    aurorae \
    libxcvt \
    libepoxy \
    virtual/egl \
    wayland \
    wayland-native \
    wayland-protocols \
    plasma-wayland-protocols \
    libxkbcommon \
    libcanberra \
    libinput \
    libei \
    libdrm \
    virtual/libgbm \
    lcms \
    freetype \
    fontconfig \
    hwdata \
    libdisplay-info \
    pipewire \
    knotifications \
    kglobalacceld \
    systemd \
    qtwaylandscanner-kde-native \
"

inherit kf6 gettext pkgconfig

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DKWIN_BUILD_X11=ON,-DKWIN_BUILD_X11=OFF,libx11 libxcb xcb-util-cursor xcb-util-keysyms xcb-util-wm libxkbcommon,xwayland"

EXTRA_OECMAKE += " \
	-DBUILD_TESTING=OFF \
	-DKWIN_BUILD_SCREENLOCKER=OFF \
	-DQTWAYLANDSCANNER_KDE_EXECUTABLE=${STAGING_BINDIR_NATIVE}/qtwaylandscanner_kde \
"

do_install:append() {
	if ! ${@bb.utils.contains('PACKAGECONFIG', 'x11', 'true', 'false', d)}; then
		sed -i "s| --xwayland||" ${D}${systemd_user_unitdir}/plasma-kwin_wayland.service
	fi
}

FILES:${PN} += "${datadir} ${libdir}/qml ${libdir}/plugins ${libdir}/kconf_update_bin ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig kirigami qtquick3d breeze aurorae qt5compat milou"
