SUMMARY = "Bookmarks management library"
HOMEPAGE = "https://invent.kde.org/frameworks/kbookmarks"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kbookmarks.git;protocol=https;nobranch=1"
SRCREV = "99622f70fd3d1d1e8c7b159b74f61437de3be337"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	kcoreaddons\
	kwidgetaddons \
"

inherit qt6-cmake gettext pkgconfig

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
