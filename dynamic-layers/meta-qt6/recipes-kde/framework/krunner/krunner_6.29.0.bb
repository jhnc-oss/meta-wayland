SUMMARY = "Framework for Plasma runners"
HOMEPAGE = "https://invent.kde.org/frameworks/krunner"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9"

SRC_URI = "git://invent.kde.org/frameworks/krunner.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-fix-metatypes-dir.patch"
SRCREV = "210df8130a39f1e3735aec671264bb1b5f2f8585"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    ki18n \
    kconfig \
    kitemmodels \
    kwindowsystem \
"

inherit kf6 gettext

FILES:${PN} += "${datadir} ${libdir}/metatypes"

RDEPENDS:${PN} += "kconfig"

