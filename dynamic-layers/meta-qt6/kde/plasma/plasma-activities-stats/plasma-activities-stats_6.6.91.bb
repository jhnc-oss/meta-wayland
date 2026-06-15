SUMMARY = "Library to access the usage statistics data collected by the KDE activity manager."
HOMEPAGE = "https://invent.kde.org/plasma/plasma-activities-stats"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/plasma/plasma-activities-stats.git;protocol=https;nobranch=1"
SRCREV = "b205fd0638e77cfe1d1a517079429347f0e3dfaa"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    plasma-activities \
    boost \
"

inherit qt6-cmake

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
}

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
