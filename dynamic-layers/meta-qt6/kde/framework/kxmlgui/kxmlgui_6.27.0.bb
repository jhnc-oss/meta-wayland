SUMMARY = "Framework for managing menu and toolbar actions"
HOMEPAGE = "https://invent.kde.org/frameworks/kxmlgui"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9"

SRC_URI = "git://invent.kde.org/frameworks/kxmlgui.git;protocol=https;nobranch=1"
SRCREV = "f29725adb7674392f0b7ab5be0b646493e2f69cd"

DEPENDS = " \
	clang-native \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	kconfigwidgets \
	kcoreaddons \
	kglobalaccel \
	kitemviews \
	kguiaddons \
	ki18n \
	kiconthemes \
	kwidgetsaddons \
	python3-shiboken6-generator-native \
	python3-pyside6 \
	python3-build-native \
"

inherit qt6-cmake gettext

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

FILES:${PN} += "${datadir}/qlogging-categories6  ${PYTHON_SITEPACKAGES_DIR}"

RDEPENDS:${PN} += "kconfig"
