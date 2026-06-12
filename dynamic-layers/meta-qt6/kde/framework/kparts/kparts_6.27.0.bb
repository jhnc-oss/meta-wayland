SUMMARY = "Plugin framework for user interface components"
HOMEPAGE = "https://invent.kde.org/frameworks/kparts"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/frameworks/kparts.git;protocol=https;nobranch=1"
SRCREV = "3a94b1a0c0ffbef833b0b70a1535fc9e42594116"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    ki18n \
    kservice \
    kjobwidgets \
    kwidgetsaddons \
    kio \
    kxmlgui \
"

inherit qt6-cmake gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6 ${STAGING_DIR_HOST}${prefix}/metatypes
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6coreaddons_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configcore_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configgui_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6guiaddons_metatypes.json
}

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} += "kconfig"

