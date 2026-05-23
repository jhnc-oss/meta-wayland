SUMMARY = "building blocks for your desktop"
HOMEPAGE = "https://quickshell.org"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/quickshell-mirror/quickshell.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-src-build-build.hpp.in-dont-include-COMPILE_FLAGS.patch"
SRCREV = "59e9c47b0eb48a9e4bcf9631fa062ee939bd2e83"

DEPENDS = "cli11 libdrm qtbase qttools-native qtdeclarative qtquick3d qtshadertools spirv-tools virtual/libgbm"
RRECOMMENDS:${PN} = "qt5compat"

inherit qt6-cmake pkgconfig

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=RelWithDebInfo"

FILES:${PN} += "${libdir}/qml/Quickshell ${datadir}"

PACKAGECONFIG = " \
	${@bb.utils.filter('DISTRO_FEATURES', 'x11 wayland pipewire polkit bluetooth pam', d)} \
	${@bb.utils.contains('TCLIBC', 'glibc', 'jemalloc', '', d)} \
	hyprland mpris network systray upower notifications i3 greetd \
"
PACKAGECONFIG[x11] = "-DX11=ON,-DX11=OFF,libx11 libxcb"
PACKAGECONFIG[wayland] = "-DWAYLAND=ON,DWAYLAND=OFF, wayland wayland-native wayland-protocols"
PACKAGECONFIG[hyprland] = "-DHYPRLAND=ON,-DHYPRLAND=OFF"
PACKAGECONFIG[i3] = "-DI3=ON,-DI3=OFF"
PACKAGECONFIG[greetd] = "-DSERVICE_GREETD=ON,-DSERVICE_GREETD=OFF"
PACKAGECONFIG[upower] = "-DSERVICE_UPOWER=ON,-DSERVICE_UPOWER=OFF"
PACKAGECONFIG[systray] = "-DSERVICE_STATUS_NOTIFIER=ON,-DSERVICE_STATUS_NOTIFIER=OFF"
PACKAGECONFIG[bluetooth] = "-DBLUETOOTH=ON,-DBLUETOOTH=OFF"
PACKAGECONFIG[network] = "-DNETWORK=ON,-DNETWORK=OFF"
PACKAGECONFIG[notifications] = "-DSERVICE_NOTIFICATIONS=ON,-DSERVICE_NOTIFICATIONS=OFF"
PACKAGECONFIG[pam] = "-DSERVICE_PAM=ON,-DSERVICE_PAM=OFF"
PACKAGECONFIG[mpris] = "-DSERVICE_MPRIS=ON,-DSERVICE_MPRIS=OFF"
PACKAGECONFIG[pipewire] = "-DSERVICE_PIPEWIRE=ON,-DSERVICE_PIPEWIRE=OFF,pipewire"
PACKAGECONFIG[polkit] = "-DSERVICE_POLKIT=ON,-DSERVICE_POLKIT=OFF,polkit"
PACKAGECONFIG[jemalloc] = "-DUSE_JEMALLOC=ON,-DUSE_JEMALLOC=OFF,jemalloc"
PACKAGECONFIG[crashreporter] = "-DCRASH_HANDLER=ON,-DCRASH_HANDLER=OFF"

do_install:prepend() {
    sed -i -e 's|${UNPACKDIR}/${BB_GIT_DEFAULT_DESTSUFFIX}|${TARGET_DBGSRC_DIR}|g' ${B}/src/dbus/dbus_objectmanager.h
    sed -i -e 's|${UNPACKDIR}/${BB_GIT_DEFAULT_DESTSUFFIX}|${TARGET_DBGSRC_DIR}|g' ${B}/src/dbus/dbusmenu/dbus_menu.h
    sed -i -e 's|${UNPACKDIR}/${BB_GIT_DEFAULT_DESTSUFFIX}|${TARGET_DBGSRC_DIR}|g' ${B}/src/network/nm/dbus_nm_backend.h
    sed -i -e 's|${UNPACKDIR}/${BB_GIT_DEFAULT_DESTSUFFIX}|${TARGET_DBGSRC_DIR}|g' ${B}/src/network/nm/dbus_nm_connection_settings.h
}
