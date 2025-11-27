SUMMARY = "Icon GUI utilities"
HOMEPAGE = "https://api.kde.org/frameworks/kiconthemes/html/index.html"
LICENSE = "MIT & LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kiconthemes.git;protocol=https;nobranch=1"
SRCREV = "4a2f268e811346ed77334c47a47bfaddbf91f6de"

DEPENDS = " \
	breeze-icons \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	karchive \
	kconfig \
	ki18n \
	kwidgetaddons \
	kcolorscheme \
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

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins/kiconthemes6 ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
