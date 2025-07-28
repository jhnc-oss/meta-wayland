SUMMARY = "Extra CMake modules"
HOMEPAGE = "https://api.kde.org/frameworks/extra-cmake-modules/html/index.html"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM += "file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "https://download.kde.org/stable/frameworks/6.16/extra-cmake-modules-${PV}.tar.xz"
SRC_URI[sha256sum] = "e881c19e335beb82326e02d000766e7ee8324d7ce8583df0f5bfd4c26998fbfe"

DEPENDS = "cmake-native qttools qtbase-native qttools-native"

inherit qt6-cmake

EXTRA_OECMAKE:append = "-DBUILD_TESTING=OFF"

FILES:${PN}-dev += " ${datadir}/ECM"

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN}-dev += "python3-core python3-as-python"

