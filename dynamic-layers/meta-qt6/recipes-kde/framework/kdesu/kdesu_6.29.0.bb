SUMMARY = "Integration with su for elevated privileges"
HOMEPAGE = "https://api.kde.org/frameworks/kdesu/html/index.html"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/frameworks/kdesu.git;protocol=https;nobranch=1"
SRCREV = "48660a13795f0834e4f9a1cf8b99414d353a31d5"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    ki18n \
    kpty \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DKDESU_USE_SUDO_DEFAULT=ON"

FILES:${PN} += "${libdir}/libexec ${datadir}"

RDEPENDS:${PN} += "sudo"
