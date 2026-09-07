SUMMARY = "Qt addon library with a collection of non-GUI utilities"
HOMEPAGE = "https://api.kde.org/frameworks/kcoreaddons/html/index.html"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kcoreaddons.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-src-CMakeLists.txt.patch"
SRCREV = "8ce411949768ea1d41ab090cb9a9f3089ee73233"

DEPENDS = " \
	qtbase \
	qttools-native \
	extra-cmake-modules \
	kconfig \
	plasma-wayland-protocols \
	util-linux \
"

DEPENDS:append:class-target = " clang-native python3-shiboken6-generator-native python3-pyside6 python3-build-native"

inherit qt6-cmake pkgconfig mime-xdg mime

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
EXTRA_OECMAKE:append:class-native = " -DBUILD_PYTHON_BINDINGS=OFF"

export LLVM_INSTALL_DIR = "${STAGING_DIR_NATIVE}${prefix_native}"

do_install:prepend() {
	install -d ${D}${libdir}/metatypes
}

FILES:${PN} += "${libdir} ${libdir}/metatypes ${datadir} ${libdir}/metatypes"

BBCLASSEXTEND = "native"
