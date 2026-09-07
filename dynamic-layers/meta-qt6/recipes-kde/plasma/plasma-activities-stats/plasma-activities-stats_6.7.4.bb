SUMMARY = "Library to access the usage statistics data collected by the KDE activity manager."
HOMEPAGE = "https://invent.kde.org/plasma/plasma-activities-stats"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/plasma/plasma-activities-stats.git;protocol=https;nobranch=1"
SRCREV = "36c6fd6c9fc6d5fdae956e433bbddd328469db81"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    plasma-activities \
    boost \
"

inherit kf6

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
