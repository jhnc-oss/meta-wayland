SUMMARY = "Plasma applet and KCM for audio volume management"
HOMEPAGE = "https://invent.kde.org/plasma/plasma-pa"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/plasma-pa.git;protocol=https;nobranch=1"
SRCREV = "cec47c3799947a6145e40d5fef7a6bbd18086e4f"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kdeclarative \
    kglobalaccel \
    kstatusnotifieritem \
    ki18n \
    kcmutils \
    ksvg \
    kdbusaddons \
    kitemmodels \
    kirigami \
    kirigami-addons \
    libplasma \
    pulseaudio-qt \
    pulseaudio \
    libcanberra \
    glib-2.0 \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF"

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig kpackage kirigami-addons"
RRECOMMENDS:${PN} += "pipewire-pulse sound-theme-freedesktop"
