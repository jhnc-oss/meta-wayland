SUMMARY = "Utilities for graphical user interfaces"
HOMEPAGE = "https://api.kde.org/frameworks/kguiaddons/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kguiaddons.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-fix-metatypes-dir.patch"
SRCREV = "49bb50323fd43f3094ef98dfbd2bbcd3e42f9f19"

DEPENDS = " \
	clang-native \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	plasma-wayland-protocols \
	python3-shiboken6-generator-native \
	python3-pyside6 \
	python3-build-native \
"

inherit qt6-cmake mime-xdg pkgconfig

EXTRA_OECMAKE += " \
	-DBUILD_TESTING=OFF \
"

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

FILES:${PN} += "${libdir}/qml ${PYTHON_SITEPACKAGES_DIR} ${datadir}/qlogging-categories6 ${libdir}/metatypes"

BBCLASSEXTEND = "native"
