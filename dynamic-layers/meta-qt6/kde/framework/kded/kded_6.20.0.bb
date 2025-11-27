SUMMARY = "Central daemon of KDE work spaces"
HOMEPAGE = "https://invent.kde.org/frameworks/kded"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kded.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-src-CMakeLists.txt-fix-runtime-path.patch"
SRCREV = "ed6e030c9d8f3db5e9b9a73f397b439338272b6e"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    kconfig \
    kcrash \
    kdbusaddons \
    kservice \
"

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

inherit qt6-cmake

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig"

