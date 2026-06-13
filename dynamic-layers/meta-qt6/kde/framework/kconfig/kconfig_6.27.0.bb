SUMMARY = "Persistent platform-independent application settings"
HOMEPAGE = "https://api.kde.org/frameworks/kwindowsystem/html/index.html"
LICENSE = "MIT & LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/frameworks/kconfig.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-fix-metatypes-dir.patch"
SRCREV = "c65b0c21749b7cbd56be7764f19b8735a8f6c718"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    qtquick3d \
"

inherit qt6-cmake

FILES:${PN} += "${libdir}/qml ${libdir}/metatypes ${datadir}/qlogging-categories6"

BBCLASSEXTEND = "native"
