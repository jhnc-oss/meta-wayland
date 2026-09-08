SUMMARY = "Framework for Plasma runners"
HOMEPAGE = "https://invent.kde.org/frameworks/krunner"
LICENSE = "BSD-2-Clause AND CC-BY-SA-4.0 AND CC0-1.0 AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9 \
    file://LICENSES/CC-BY-SA-4.0.txt;md5=7130783469368ceb248a4f03e89ea4b8 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=852ecadc0ac7e6f4d7144d5544a3815b \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/frameworks/krunner.git;protocol=https;nobranch=1;tag=v6.29.0"
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

