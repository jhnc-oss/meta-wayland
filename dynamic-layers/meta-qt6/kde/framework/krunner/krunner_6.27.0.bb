SUMMARY = "Framework for Plasma runners"
HOMEPAGE = "https://invent.kde.org/frameworks/krunner"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9"

SRC_URI = "git://invent.kde.org/frameworks/krunner.git;protocol=https;nobranch=1"
SRCREV = "685680777648d8e7802711c15958bf0c2f7c9ab0"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    ki18n \
    kconfig \
    kitemmodels \
    kwindowsystem \
"

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6 ${STAGING_DIR_HOST}${prefix}/metatypes
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6coreaddons_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configcore_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configgui_metatypes.json
}

inherit qt6-cmake gettext

FILES:${PN} += "${datadir} ${prefix}/metatypes"

RDEPENDS:${PN} += "kconfig"

