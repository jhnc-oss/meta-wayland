SUMMARY = "Daemon for globalaccel"
HOMEPAGE = "https://invent.kde.org/plasma/kglobalacceld"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404"

SRC_URI = "git://invent.kde.org/plasma/kglobalacceld.git;protocol=https;nobranch=1"
SRCREV = "787be010272e9e0ca4591815a7363ce651627caf"

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
	mkdir -p ${STAGING_LIBEXECDIR}/kf6 ${STAGING_DIR_HOST}${prefix}/metatypes
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6coreaddons_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configcore_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configgui_metatypes.json
}

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"

RDEPENDS:${PN} += "kconfig"
