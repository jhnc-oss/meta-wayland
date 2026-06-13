SUMMARY = "KScreen is the screen management software for KDE Plasma Workspaces"
HOMEPAGE = "https://invent.kde.org/plasma/kscreen"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/kscreen.git;protocol=https;nobranch=1"
SRCREV = "302bf2512dbb0804c0f3c7da0a35902a80d11969"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    qt5compat \
    extra-cmake-modules \
    kconfig \
    kconfig-native \
    kcoreaddons \
    kdbusaddons \
    ki18n \
    kitemmodels \
    kcmutils \
    kcmutils-tools-native \
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

inherit qt6-cmake gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DWITH_X11=OFF"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_BINDIR}/kpackagetool6
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig"

CXXFLAGS += "-Wno-unused-result"
