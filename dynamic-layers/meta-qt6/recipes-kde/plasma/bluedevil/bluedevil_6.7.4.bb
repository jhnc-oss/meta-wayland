SUMMARY = "Bluedevil adds Bluetooth capabilities to KDE Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/bluedevil"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/bluedevil.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-src-kded-helpers-requestpin.cpp-fix-build-without-x1.patch"
SRCREV = "3017e275c589157e1cefa211c4e8d5fce56f0da1"

DEPENDS = " \
    bluez-qt \
    kcmutils \
    kcoreaddons \
    kdbusaddons \
    kdeclarative \
    ki18n \
    kio \
    kirigami \
    kjobwidgets \
    knotifications \
    kservice \
    ksvg \
    kwidgetsaddons \
    kwindowsystem \
    libplasma \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    shared-mime-info-native \
"

inherit kf6 gettext mime mime-xdg

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "bash kconfig kpackage"
