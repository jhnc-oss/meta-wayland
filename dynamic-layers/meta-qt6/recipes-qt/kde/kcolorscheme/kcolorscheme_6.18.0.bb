SUMMARY = "Access to the windowing system"
HOMEPAGE = "https://api.kde.org/frameworks/kcolorscheme/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5"

SRC_URI = "git://invent.kde.org/frameworks/kcolorscheme.git;protocol=https;nobranch=1"
SRCREV = "ba3ccfcd1b049e7b6a078765e5ef76803dde2afb"

DEPENDS = " \
	appstream-native \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	ki18n \
	kguiaddons \
"

inherit qt6-cmake gettext pkgconfig

do_configure:prepend() {
	# Those files are provided by 'kconfig' package but dont make it into STAGING_SYSROOT
	#|   The imported target "KF6::kconfig_compiler" references the file
	#|
	#|      "../6.17.0/recipe-sysroot/usr/libexec/kf6/kconfig_compiler_kf6"
	#|
	#|   but this file does not exist.
	# add a hack to avoid cmake confusion:
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
}

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
