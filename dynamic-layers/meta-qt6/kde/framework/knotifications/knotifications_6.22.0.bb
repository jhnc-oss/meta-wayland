SUMMARY = "Desktop Notifications"
HOMEPAGE = "https://invent.kde.org/frameworks/knotifications"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/knotifications.git;protocol=https;nobranch=1"
SRCREV = "a335d7880124bc21a4b9d8a9367fd1a93f8ea0f8"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	python3-shiboken6-native \
	python3-pyside6 \
	libcanberra \
"

inherit qt6-cmake pkgconfig

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${libdir}/qml ${PYTHON_SITEPACKAGES_DIR} ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
