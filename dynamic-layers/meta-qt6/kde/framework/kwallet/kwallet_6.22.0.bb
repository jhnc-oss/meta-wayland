SUMMARY = "Safe desktop-wide storage for passwords"
HOMEPAGE = "https://invent.kde.org/frameworks/kwallet"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kwallet.git;protocol=https;nobranch=1"
SRCREV = "aee55db955c86fd829b4c4b7d3a8de6757b4a5c9"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	kcoreaddons \
	ki18n \
	kwindowsystem \
	knotifications \
	kwidgetaddons \
	kcolorscheme \
	kdbusaddons \
	kcrash \
	qca \
	libsecret \
"

inherit qt6-cmake gettext pkgconfig

# ksecret daemon build requires qt5
EXTRA_OECMAKE += "-DOE_QCA_PATH_HOST_ROOT=${STAGING_DIR_HOST} -DBUILD_KSECRETD=OFF"

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${datadir}"
