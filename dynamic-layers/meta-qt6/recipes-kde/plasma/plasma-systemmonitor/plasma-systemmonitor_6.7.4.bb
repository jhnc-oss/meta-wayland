SUMMARY = "System monitor for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-systemmonitor"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/plasma-systemmonitor.git;protocol=https;nobranch=1"
SRCREV = "3f079ab22cbc4e790f6bf63c3c3a6e0bc31c36c4"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig \
    ki18n \
    kcrash \
    kservice \
    kglobalaccel \
    kio \
    kdbusaddons \
    knewstuff \
    kitemmodels \
    kwindowsystem \
    kpackage \
    kirigami \
    kirigami-addons \
    libksysguard \
    ksystemstats \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${libdir}/libPlasmaSystemMonitor*.so ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig kpackage kirigami kirigami-addons ksystemstats"
