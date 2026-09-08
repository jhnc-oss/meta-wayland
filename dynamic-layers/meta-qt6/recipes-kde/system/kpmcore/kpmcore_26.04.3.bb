SUMMARY = "Library for managing partitions"
HOMEPAGE = "https://invent.kde.org/system/kpmcore"
LICENSE = "CC-BY-4.0 AND CC0-1.0 AND GPL-3.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC-BY-4.0.txt;md5=28bacf04b75cbad10cb7871e0b063188 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/system/kpmcore.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "6339fabef0a795729cf03136a93bbb3b240575db"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    ki18n \
    kwidgetsaddons \
    polkit-qt \
    util-linux \
"

inherit qt6-cmake gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "util-linux-sfdisk"
RRECOMMENDS:${PN} += "e2fsprogs dosfstools exfatprogs btrfs-tools"
