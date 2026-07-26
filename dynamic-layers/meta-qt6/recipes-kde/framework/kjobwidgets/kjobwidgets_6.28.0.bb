SUMMARY = "Widgets for showing progress of asynchronous jobs"
HOMEPAGE = "https://invent.kde.org/frameworks/kjobwidgets"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/frameworks/kjobwidgets.git;protocol=https;nobranch=1"
SRCREV = "ad102d3ce409d7355c43b7d380e223ec52784051"

DEPENDS = " \
	clang-native \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kcoreaddons \
	kwidgetsaddons \
	knotifications \
	python3-shiboken6-generator-native \
	python3-pyside6 \
"

inherit qt6-cmake

CXXFLAGS += "-I${STAGING_INCDIR}/PySide6/KCoreAddons"

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

FILES:${PN} += "${PYTHON_SITEPACKAGES_DIR} ${datadir}"
