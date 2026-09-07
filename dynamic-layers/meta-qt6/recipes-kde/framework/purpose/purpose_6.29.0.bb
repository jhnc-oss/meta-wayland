SUMMARY = "Framework for providing abstractions to get the developer's purposes fulfilled"
HOMEPAGE = "https://api.kde.org/frameworks/purpose/html/index.html"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

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
