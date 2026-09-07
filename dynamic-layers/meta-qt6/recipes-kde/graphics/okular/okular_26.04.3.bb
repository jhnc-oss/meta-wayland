SUMMARY = "Universal document viewer"
HOMEPAGE = "https://invent.kde.org/graphics/okular"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/graphics/okular.git;protocol=https;nobranch=1"
SRCREV = "a8cfd38065ec55c96790791a6b7c3aebef23a151"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtsvg \
    qtdeclarative \
    extra-cmake-modules \
    karchive \
    kbookmarks \
    kcompletion \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    ki18n \
    kio \
    threadweaver \
    kwindowsystem \
    kxmlgui \
    kiconthemes \
    kparts \
    kcolorscheme \
    kcrash \
    ktextwidgets \
    kwidgetsaddons \
    kwallet \
    purpose \
    kirigami \
    kirigami-addons \
    poppler \
    freetype \
    zlib \
    tiff \
    jpeg \
"

inherit kf6 gettext mime-xdg

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DCMAKE_DISABLE_FIND_PACKAGE_KF6DocTools=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_Phonon4Qt6=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_Qt6TextToSpeech=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_KExiv2Qt6=ON \
    -DFORCE_NOT_REQUIRED_DEPENDENCIES="LibSpectre;DjVuLibre;EPub;Discount" \
"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake ${libdir}/lib*.so"

RDEPENDS:${PN} += "kconfig kirigami kirigami-addons"

INSANE_SKIP:${PN} = "dev-so"
