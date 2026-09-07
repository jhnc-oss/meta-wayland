SUMMARY = "Wallet management tool"
HOMEPAGE = "https://invent.kde.org/utilities/kwalletmanager"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/utilities/kwalletmanager.git;protocol=https;nobranch=1"
SRCREV = "73e80e3438e15165f058d6c49f45b5df0fcb24b9"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kauth \
    karchive \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kdbusaddons \
    ki18n \
    kcmutils \
    kio \
    kwallet \
    kwindowsystem \
    kxmlgui \
    kcrash \
    kstatusnotifieritem \
    kservice \
"

inherit kf6 gettext mime-xdg

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF"

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig kwallet"
