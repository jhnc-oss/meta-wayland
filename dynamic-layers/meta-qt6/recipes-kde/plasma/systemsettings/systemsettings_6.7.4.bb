SUMMARY = "Plasma System Settings"
HOMEPAGE = "https://invent.kde.org/plasma/systemsettings"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/systemsettings.git;protocol=https;nobranch=1"
SRCREV = "2aa33d6af825f9d98d1f75f453b6b6037d773d10"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kauth \
    kcrash \
    kitemviews \
    kitemmodels \
    kcmutils \
    ki18n \
    kio \
    kservice \
    kiconthemes \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    kdbusaddons \
    kconfig \
    kcoreaddons \
    kguiaddons \
    kirigami \
    kjobwidgets \
    krunner \
    kcolorscheme \
    plasma-activities \
"

inherit kf6 gettext mime mime-xdg

FILES:${PN} += " \
	${libdir}/kconf_update_bin \
	${libdir}/plugins \
	${datadir} \
	${systemd_user_unitdir} \
"

RDEPENDS:${PN} += "kconfig kirigami qtquick3d"
