SUMMARY = "Desktop Notifications"
HOMEPAGE = "https://invent.kde.org/frameworks/knotifications"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/knotifications.git;protocol=https;nobranch=1"
SRCREV = "797f74141d97da75c5bad185fb89b13f93fb73ef"

DEPENDS = " \
	clang-native \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	python3-shiboken6-generator-native \
	python3-pyside6 \
	libcanberra \
"

inherit qt6-cmake pkgconfig

replace_llvm_config_path() {
    if [ -f "${STAGING_BINDIR_CROSS}/llvm-config" ]; then
        sed -i \
            's#@LLVM_CONFIG_PATH@#${STAGING_BINDIR_NATIVE}/llvm-config#g' \
            ${STAGING_BINDIR_CROSS}/llvm-config
    fi
}

do_configure:prepend:class-target() {
    replace_llvm_config_path
}

do_configure:prepend:class-nativesdk() {
    replace_llvm_config_path
}

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${libdir}/qml ${PYTHON_SITEPACKAGES_DIR} ${datadir}/qlogging-categories6 ${libdir}/metatypes"

RDEPENDS:${PN} += "kconfig"
