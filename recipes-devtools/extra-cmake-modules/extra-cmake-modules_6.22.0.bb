SUMMARY = "Extra CMake modules"
HOMEPAGE = "https://api.kde.org/frameworks/extra-cmake-modules/html/index.html"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM += "file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/extra-cmake-modules.git;protocol=https;nobranch=1"
SRCREV = "3f76d71045e935ced4723c12345162f16cc8cb21"

DEPENDS = "${@bb.utils.contains('DISTRO_FEATURES', 'kde', 'qttools qtbase-native qttools-native', '', d)}"

inherit cmake

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DQT_HOST_PATH:PATH=${RECIPE_SYSROOT_NATIVE}${prefix_native}"

FILES:${PN}-dev += " ${datadir}/ECM"

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN}-dev:class-target += "python3-core python3-as-python"

