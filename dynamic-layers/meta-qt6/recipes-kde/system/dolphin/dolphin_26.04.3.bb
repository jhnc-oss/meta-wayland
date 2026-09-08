SUMMARY = "Dolphin is KDE's file manager"
HOMEPAGE = "https://invent.kde.org/system/dolphin"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-3.0-only.txt;md5=7b8fde44990707e743d3613054065137 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
"

SRC_URI = "git://invent.kde.org/system/dolphin.git;protocol=https;nobranch=1;tag=v26.04.3"
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
