SUMMARY = "Plugin based library to create window decorations"
HOMEPAGE = "https://invent.kde.org/plasma/kdecoration"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f"

SRC_URI = "git://invent.kde.org/plasma/kdecoration.git;protocol=https;nobranch=1"
SRCREV = "a9379b72d1076cb787380a8319f9c6fa781b18a6"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"

RDEPENDS:${PN} += "kconfig"
