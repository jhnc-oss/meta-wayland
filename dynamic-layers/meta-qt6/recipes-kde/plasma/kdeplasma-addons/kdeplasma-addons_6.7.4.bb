SUMMARY = "Additional applets, runners, wallpapers and KWin effects for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/kdeplasma-addons"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND GPL-3.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LGPL-3.0-or-later AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=d0f280d1058e77e66264a9b9e10e6c89 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=852ecadc0ac7e6f4d7144d5544a3815b \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
"

SRC_URI = "git://invent.kde.org/plasma/kdeplasma-addons.git;protocol=https;nobranch=1;tag=v6.7.4"
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
