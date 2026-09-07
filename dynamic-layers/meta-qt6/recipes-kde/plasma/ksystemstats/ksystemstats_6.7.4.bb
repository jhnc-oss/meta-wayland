SUMMARY = "Daemon that collects system statistics for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/ksystemstats"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/ksystemstats.git;protocol=https;nobranch=1"
SRCREV = "ccbb083b6ba92a31ad62e32157586f0aa5f4ab75"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kconfig-native \
    kcoreaddons \
    solid \
    kio \
    kcrash \
    networkmanager-qt \
    libksysguard \
    libcap \
    libnl \
    lmsensors \
    udev \
"

inherit qt6-cmake gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/plugins ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig"
