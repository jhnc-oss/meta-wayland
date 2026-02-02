SUMMARY = "Text editing widgets"
HOMEPAGE = "https://invent.kde.org/frameworks/ktextwidgets"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/ktextwidgets.git;protocol=https;nobranch=1"
SRCREV = "cadbcf79438e217ff045a15ee9c5573437c4892c"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcompletion \
    kconfig \
    ki18n \
    kwidgetaddons \
    sonnet \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
