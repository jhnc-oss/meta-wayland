SUMMARY = "KService allows to query information about installed applications and their associated file types"
HOMEPAGE = "https://invent.kde.org/frameworks/kservice"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kservice.git;protocol=https;nobranch=1"
SRCREV = "67ab6fdddd531f63a72f2423196aeb0b1a0d1d54"

DEPENDS = " \
    appstream-native \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    ki18n \
    kconfig \
"

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

inherit qt6-cmake

FILES:${PN} += "${datadir}"

