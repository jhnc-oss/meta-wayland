SUMMARY = "Central daemon of KDE work spaces"
HOMEPAGE = "https://invent.kde.org/frameworks/kded"
LICENSE = "CC0-1.0 AND LGPL-2.0-only AND LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

SRC_URI = "git://invent.kde.org/frameworks/kded.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-src-CMakeLists.txt-fix-runtime-path.patch"
SRCREV = "f38e14e0ced0312231150aaec922417eda8aed42"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    kconfig \
    kcrash \
    kdbusaddons \
    kservice \
"

inherit kf6

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig"

