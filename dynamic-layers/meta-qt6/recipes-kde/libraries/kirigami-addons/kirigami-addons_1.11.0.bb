SUMMARY = "Add-ons for the Kirigami framework"
HOMEPAGE = "https://invent.kde.org/libraries/kirigami-addons"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/libraries/kirigami-addons.git;protocol=https;nobranch=1"
SRCREV = "10ad7ec72702b6eddaab037e379f0df6aaddd310"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kirigami \
    ki18n \
    kconfig \
    kcoreaddons \
    kcrash \
    kguiaddons \
    kcolorscheme \
    kglobalaccel \
    kiconthemes \
"

inherit kf6 gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_EXAMPLES=OFF"

FILES:${PN} += "${libdir}/qml ${datadir}"

RDEPENDS:${PN} += "kirigami"
