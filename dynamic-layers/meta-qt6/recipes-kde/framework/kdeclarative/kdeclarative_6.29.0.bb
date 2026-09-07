SUMMARY = "Integration of QML and KDE work spaces"
HOMEPAGE = "https://invent.kde.org/frameworks/kdeclarative"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/frameworks/kdeclarative.git;protocol=https;nobranch=1"
SRCREV = "2d8a19adf76f7d253f326ae9c7d3d74dc1d0f71d"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n\
    kconfig \
    kguiaddons \
    kglobalaccel \
    kwidgetsaddons \
"

inherit kf6 gettext

FILES:${PN} += "${libdir}/qml ${datadir}"

RDEPENDS:${PN} += "kconfig"

