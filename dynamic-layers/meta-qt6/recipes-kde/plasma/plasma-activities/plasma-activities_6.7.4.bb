SUMMARY = "Core components for the KDE Activity concept"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-activities"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7"

SRC_URI = "git://invent.kde.org/plasma/plasma-activities.git;protocol=https;nobranch=1"
SRCREV = "8470fabe764d2918a426b07e1dbb89fdabfdb99c"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
"

inherit kf6

FILES:${PN} += "${libdir}/qml ${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
