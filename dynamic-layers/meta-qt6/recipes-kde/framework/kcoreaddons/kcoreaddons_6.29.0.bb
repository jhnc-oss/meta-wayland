SUMMARY = "Qt addon library with a collection of non-GUI utilities"
HOMEPAGE = "https://api.kde.org/frameworks/kcoreaddons/html/index.html"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL AND LicenseRef-Qt-Commercial AND MPL-1.1"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/LicenseRef-Qt-Commercial.txt;md5=df490d93422a5e93c436cdb31a6c4e74 \
    file://LICENSES/MPL-1.1.txt;md5=bf952b9d390406a3cda9fb3fe9df72af \
    file://LICENSES/Qt-LGPL-exception-1.1.txt;md5=38d22f987f077611a625f5729dd0fd39 \
"

SRC_URI = "git://invent.kde.org/frameworks/kcoreaddons.git;protocol=https;nobranch=1;tag=v6.29.0"
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
