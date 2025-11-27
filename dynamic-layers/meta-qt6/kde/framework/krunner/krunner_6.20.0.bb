SUMMARY = "Framework for Plasma runners"
HOMEPAGE = "https://invent.kde.org/frameworks/krunner"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9"

SRC_URI = "git://invent.kde.org/frameworks/krunner.git;protocol=https;nobranch=1"
SRCREV = "8fb1b2e50b0e0228f2bdcca838ed038e0a59e969"

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
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

inherit qt6-cmake gettext

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} += "kconfig"

