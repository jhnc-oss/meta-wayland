SUMMARY = "Daemon for globalaccel"
HOMEPAGE = "https://invent.kde.org/plasma/kglobalacceld"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404"

SRC_URI = "git://invent.kde.org/plasma/kglobalacceld.git;protocol=https;nobranch=1"
SRCREV = "dd6cefe5e62fabc910b671041a8d070f644ee1b7"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    kwindowsystem \
    kglobalaccel \
    kservice \
    kio \
    kjobwidgets \
"

inherit qt6-cmake

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DWITH_X11=OFF"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
}

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"

RDEPENDS:${PN} += "kconfig"
