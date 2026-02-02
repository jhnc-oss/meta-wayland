SUMMARY = "Powerful completion framework, including completion-enabled lineedit and combobox"
HOMEPAGE = "https://invent.kde.org/frameworks/kcompletion"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kcompletion.git;protocol=https;nobranch=1"
SRCREV = "2864a16edec2c4b6ddcbe5cafafa25c834aff3b5"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kcodecs \
	kconfig \
	kwidgetaddons \
"

inherit qt6-cmake pkgconfig

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
