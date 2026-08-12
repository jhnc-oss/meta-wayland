SUMMARY = "Library and components for secure lock screen architecture"
HOMEPAGE = "https://invent.kde.org/plasma/kscreenlocker"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/kscreenlocker.git;protocol=https;nobranch=1"
SRCREV = "28544d4910d5ea9be6708eb343804fa0018cb8e4"

DEPENDS = " \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
    kconfig \
    kconfig-native \
    kcrash \
    kcmutils \
    kcmutils-tools-native \
    ki18n \
    kglobalaccel \
    knotifications \
    kidletime \
    libpam \
    solid \
    systemd \
    kwindowsystem \
    kxmlgui \
    kio \
    ksvg \
    wayland \
    wayland-native \
    kscreen \
    layer-shell-qt \
    libx11 \
    libxcb \
    xinput \
"

inherit cmake gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF EXTRA_OECMAKE -DQT_HOST_PATH:PATH=${RECIPE_SYSROOT_NATIVE}${prefix_native}"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_BINDIR}/kpackagetool6
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig"
