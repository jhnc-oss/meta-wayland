SUMMARY = "Full text editor component"
HOMEPAGE = "https://api.kde.org/frameworks/ktexteditor/html/index.html"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2"

SRC_URI = "git://invent.kde.org/frameworks/ktexteditor.git;protocol=https;nobranch=1"
SRCREV = "f31aabb85df62431fc66ffbde11216302c185d53"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	karchive \
	kguiaddons \
	ki18n \
	kio \
	kauth \
	kparts \
	sonnet \
	syntax-highlighting \
	kcolorscheme \
"

inherit qt6-cmake gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6 ${STAGING_DIR_HOST}${prefix}/metatypes
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6coreaddons_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6guiaddons_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configcore_metatypes.json
	touch ${STAGING_DIR_HOST}${prefix}/metatypes/qt6kf6configgui_metatypes.json
}

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig"
