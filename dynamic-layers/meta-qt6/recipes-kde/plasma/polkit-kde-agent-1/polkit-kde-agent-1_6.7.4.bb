SUMMARY = "Daemon providing a polkit authentication UI for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/polkit-kde-agent-1"
LICENSE = "CC0-1.0 AND GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

SRC_URI = "git://invent.kde.org/plasma/polkit-kde-agent-1.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "d09f12b04e88b6c4ac093c5f2b62ea34db25e299"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    ki18n \
    kwindowsystem \
    knotifications \
    kdbusaddons \
    kcoreaddons \
    kcrash \
    polkit-qt \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "polkit"
