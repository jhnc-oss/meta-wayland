SUMMARY = "KWin is an easy to use, but flexible, compositor for Wayland on Linux"
HOMEPAGE = "https://invent.kde.org/plasma/kwin"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

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
