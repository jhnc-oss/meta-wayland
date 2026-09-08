SUMMARY = "Breeze is the default style for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/breeze"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/plasma/breeze.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "8f5f92db32cf485f2fbe19b59ccb2f4f46e69096"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    frameworkintegration \
    qtquick3d \
    qtsvg \
    kcmutils \
    kconfigwidgets \
    kcoreaddons \
    kdecoration \
    kguiaddons \
    kiconthemes \
    kcolorscheme \
    ki18n \
    kirigami \
    kpackage \
    kwayland \
    kwindowsystem \
"

inherit kf6 gettext

EXTRA_OECMAKE = "-DBUILD_QT5=OFF -DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "breeze-icons qtquick3d kconfig kirigami frameworkintegration"

