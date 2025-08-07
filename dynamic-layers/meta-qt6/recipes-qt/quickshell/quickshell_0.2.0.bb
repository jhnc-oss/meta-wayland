SUMMARY = "building blocks for your desktop"
HOMEPAGE = "https://quickshell.org"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/quickshell-mirror/quickshell.git;protocol=https;branch=master"
SRC_URI += "file://0001-dont-bake-compile-flags-into-binary.patch"

SRCREV = "a5431dd02dc23d9ef1680e67777fed00fe5f7cda"

DEPENDS = "cli11 qtbase qttools-native qtdeclarative qtquick3d qtshadertools spirv-tools virtual/libgbm"
RRECOMMENDS:${PN} = "qt5compat"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=RelWithDebInfo"

FILES:${PN} += "${libdir}/qml/Quickshell ${datadir}"

PACKAGECONFIG = "${@bb.utils.filter('DISTRO_FEATURES', 'x11 wayland pipewire bluetooth pam', d)} hyprland mpris systray upower notifications i3 greetd"
PACKAGECONFIG[x11] = "-DX11=ON,-DX11=OFF,libx11 libxcb"
PACKAGECONFIG[wayland] = "-DWAYLAND=ON,DWAYLAND=OFF,qtwayland qtwayland-native"
PACKAGECONFIG[hyprland] = "-DHYPRLAND=ON,-DHYPRLAND=OFF"
PACKAGECONFIG[i3] = "-DI3=ON,-DI3=OFF"
PACKAGECONFIG[greetd] = "-DGREETD=ON,-DGREETD=OFF"
PACKAGECONFIG[upower] = "-DUPOWER=ON,-DUPOWER=OFF"
PACKAGECONFIG[systray] = "-DSERVICE_STATUS_NOTIFIER=ON,-DSERVICE_STATUS_NOTIFIER=OFF"
PACKAGECONFIG[bluetooth] = "-DBLUETOOTH=ON,-DBLUETOOTH=OFF"
PACKAGECONFIG[notifications] = "-DSERVICE_NOTIFICATIONS=ON,-DSERVICE_NOTIFICATIONS=OFF"
PACKAGECONFIG[pam] = "-DPAM=ON,-DPAM=OFF"
PACKAGECONFIG[mpris] = "-DMPRIS=ON,-DMPRIS=OFF"
PACKAGECONFIG[pipewire] = "-DPIPEWIRE=ON,-DPIPEWIRE=OFF,pipewire"
PACKAGECONFIG[jemalloc] = "-DUSE_JEMALLOC=ON,-DUSE_JEMALLOC=OFF,jemalloc"
PACKAGECONFIG[crashreporter] = "-DCRASH_REPORTER=ON,-DCRASH_REPORTER=OFF"

do_install:prepend() {
    sed -i -e 's|${UNPACKDIR}/${BB_GIT_DEFAULT_DESTSUFFIX}|${TARGET_DBGSRC_DIR}|g' ${B}/src/dbus/dbus_objectmanager.h
    sed -i -e 's|${UNPACKDIR}/${BB_GIT_DEFAULT_DESTSUFFIX}|${TARGET_DBGSRC_DIR}|g' ${B}/src/dbus/dbusmenu/dbus_menu.h
}
