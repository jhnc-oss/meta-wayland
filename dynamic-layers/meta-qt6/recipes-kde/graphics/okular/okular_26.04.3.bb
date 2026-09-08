SUMMARY = "Universal document viewer"
HOMEPAGE = "https://invent.kde.org/graphics/okular"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND GFDL-1.2-or-later AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND GPL-3.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND LicenseRef-KDE-Accepted-GPL AND MIT AND X11"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=f225922a2c12dfa5218fb70c49db3ea6 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9f58808219e9a42ff1228309d6f83dc6 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/GPL-3.0-or-later.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
    file://LICENSES/X11.txt;md5=87f08485cf6ba3c63a00eda8ecba7f1d \
"

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
