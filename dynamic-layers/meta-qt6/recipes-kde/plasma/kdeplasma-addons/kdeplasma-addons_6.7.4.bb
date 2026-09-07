SUMMARY = "Additional applets, runners, wallpapers and KWin effects for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/kdeplasma-addons"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/kdeplasma-addons.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-make-the-Rust-based-kameleon-qmk-helper-optional.patch"
SRCREV = "57ab0e90662dd258bf35d07c1c0503a260f7d16d"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kdbusaddons \
    kdeclarative \
    kglobalaccel \
    kguiaddons \
    kholidays \
    ki18n \
    kauth \
    kio \
    kcmutils \
    knotifications \
    krunner \
    kservice \
    sonnet \
    kunitconversion \
    kxmlgui \
    knewstuff \
    kjobwidgets \
    ksvg \
    kwidgetsaddons \
    kitemmodels \
    kirigami-addons \
    purpose \
    libplasma \
    icu \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig kpackage plasma-workspace"
RRECOMMENDS:${PN} += "qtquick3d"

INSANE_SKIP:${PN} = "dev-so"
