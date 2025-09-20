SUMMARY = "QT6 Theme Provider for Hyprland"
HOMEPAGE = "https://github.com/hyprwm/hyprqt6engine"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a0bf31bc487405beb07b19459ea85114"

SRC_URI = "git://github.com/hyprwm/hyprqt6engine.git;protocol=https;branch=main"

SRCREV = "9063e6837b4e282a73b052a0c0371916daccf50a"

DEPENDS = "qtbase  qtquick3d qttools-native hyprutils hyprlang"

inherit qt6-cmake pkgconfig

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

PACKAGECONFIG ?= "kde"
PACKAGECONFIG[kde] = ",,kconfig kiconthemes kcolorscheme"

EXTRA_OECMAKE += "-DPLUGINDIR=${libdir}/plugins"

FILES:${PN} += "${libdir}/plugins ${libdir}/libhyprqt6engine-common.so"
FILES:${PN}-dev = ""
