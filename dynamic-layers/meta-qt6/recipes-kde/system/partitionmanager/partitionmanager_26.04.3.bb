SUMMARY = "Partition editor for KDE"
HOMEPAGE = "https://invent.kde.org/system/partitionmanager"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-3.0-or-later.txt;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://invent.kde.org/system/partitionmanager.git;protocol=https;nobranch=1"
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
