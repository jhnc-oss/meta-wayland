SUMMARY = "Partition editor for KDE"
HOMEPAGE = "https://invent.kde.org/system/partitionmanager"
LICENSE = "CC-BY-4.0 AND CC0-1.0 AND GFDL-1.2-or-later AND GPL-3.0-or-later AND LGPL-3.0-or-later AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC-BY-4.0.txt;md5=28bacf04b75cbad10cb7871e0b063188 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=ad1419ecc56e060eccf8184a87c4285f \
    file://LICENSES/GPL-3.0-or-later.txt;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=3000208d539ec061b899bce1d9ce9404 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/system/partitionmanager.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "1a7b5aea841664cf9036fba42b03f83277faa9dd"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    ki18n \
    kjobwidgets \
    kio \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    kpmcore \
    polkit-qt \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DCMAKE_DISABLE_FIND_PACKAGE_KF6DocTools=ON"

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} += "kconfig polkit"
