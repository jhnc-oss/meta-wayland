SUMMARY = "Plasma System Settings"
HOMEPAGE = "https://invent.kde.org/plasma/systemsettings"
LICENSE = "BSD-2-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.1-or-later AND LicenseRef-KDE-Accepted-GPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
"

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
