SUMMARY = "Dolphin is KDE's file manager"
HOMEPAGE = "https://invent.kde.org/system/dolphin"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2"

SRC_URI = "git://invent.kde.org/system/dolphin.git;protocol=https;nobranch=1"
SRCREV = "2131cb786aac6bb09cc6638a8da50660f97dacc0"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    libxkbcommon \
    kcoreaddons \
    kguiaddons \
    ki18n \
    kcrash \
    kcolorscheme \
    kcodecs \
    kwindowsystem \
    kwidgetsaddons \
    kio \
    solid \
    kiconthemes \
    kparts \
    kdbusaddons \
    knotifications \
    kbookmarks \
    kcompletion \
    ktextwidgets \
    kcmutils \
    knewstuff \
    kfilemetadata \
"

inherit kf6 gettext mime mime-xdg

FILES:${PN} += " \
	${libdir}/kconf_update_bin \
	${libdir}/plugins \
	${datadir} \
	${systemd_user_unitdir} \
"

RDEPENDS:${PN} += "kconfig"
