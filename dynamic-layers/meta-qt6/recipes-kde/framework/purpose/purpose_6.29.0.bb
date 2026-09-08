SUMMARY = "Framework for providing abstractions to get the developer's purposes fulfilled"
HOMEPAGE = "https://api.kde.org/frameworks/purpose/html/index.html"
LICENSE = "CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.0-or-later AND LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

SRC_URI = "git://invent.kde.org/frameworks/purpose.git;protocol=https;nobranch=1"
SRCREV = "8473417a25a9a7c7ba137d34289063b8053c403e"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    ki18n \
    kio \
    kirigami \
    kitemmodels \
    kcmutils \
    knotifications \
    kservice \
    prison \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig kirigami kitemmodels kcmutils prison"
