SUMMARY = "Library for managing partitions"
HOMEPAGE = "https://invent.kde.org/system/kpmcore"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-3.0-or-later.txt;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://invent.kde.org/system/kpmcore.git;protocol=https;nobranch=1"
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
