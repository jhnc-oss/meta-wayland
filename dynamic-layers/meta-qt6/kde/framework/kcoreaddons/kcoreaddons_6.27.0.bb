SUMMARY = "Qt addon library with a collection of non-GUI utilities"
HOMEPAGE = "https://api.kde.org/frameworks/kcoreaddons/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kcoreaddons.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-src-CMakeLists.txt.patch"
SRCREV = "10fc1d72eb96e775e9cb2e829f485a8596609b3c"

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

inherit qt6-cmake pkgconfig mime-xdg mime

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

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

do_install:prepend() {
	install -d ${D}${libdir}/metatypes
}

FILES:${PN} += "${libdir} ${libdir}/metatypes ${datadir} ${libdir}/metatypes"

BBCLASSEXTEND = "native"
