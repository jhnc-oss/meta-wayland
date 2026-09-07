SUMMARY = "KNightTime provides helpers for scheduling the dark-light cycle"
HOMEPAGE = "https://invent.kde.org/plasma/knighttime"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/knighttime.git;protocol=https;nobranch=1"
SRCREV = "bdee860f787fd1f2e1e2efe4d65ed6138eeaeb4e"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    kdbusaddons \
    kholidays \
    ki18n \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"

RDEPENDS:${PN} += "kconfig"
