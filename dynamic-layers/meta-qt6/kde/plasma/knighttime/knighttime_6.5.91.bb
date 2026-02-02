SUMMARY = "KNightTime provides helpers for scheduling the dark-light cycle"
HOMEPAGE = "https://invent.kde.org/plasma/knighttime"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/knighttime.git;protocol=https;nobranch=1"
SRCREV = "633a7d1cc58563697cbb7de6cf7df9fc1e34d181"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig-native \
    kcoreaddons \
    kdbusaddons \
    kholidays \
    ki18n \
"

inherit qt6-cmake gettext

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	# knighttime indeed wants to use kconfig_compiler_kf6 -> create a link instead of touch
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
}

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"

RDEPENDS:${PN} += "kconfig"
