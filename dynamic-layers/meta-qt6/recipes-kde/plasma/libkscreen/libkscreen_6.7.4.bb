SUMMARY = "libkscreen is the screen management library for KDE Plasma Workspaces"
HOMEPAGE = "https://invent.kde.org/plasma/libkscreen"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/libkscreen.git;protocol=https;nobranch=1"
SRCREV = "33432e490d0adc6c1ded65d2d24cf0ec7f24da0f"

DEPENDS = " \
    qtbase \
    qttools-native \
    wayland \
    wayland-native \
    plasma-wayland-protocols \   
"

inherit qt6-cmake gettext

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_BINDIR}/kpackagetool6
}

EXTRA_OECMAKE += "-DWITHOUT_X11=ON -DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir} ${datadir} ${systemd_user_unitdir}"
