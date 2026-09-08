SUMMARY = "Archive manager for KDE"
HOMEPAGE = "https://invent.kde.org/utilities/ark"
LICENSE = "BSD-2-Clause AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-3.0-only AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-3.0-only.txt;md5=7b8fde44990707e743d3613054065137 \
    file://LICENSES/MIT.txt;md5=4dd71a82d66fd9e3ca0cc65b8be370c0 \
"

SRC_URI = "git://invent.kde.org/utilities/ark.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "8fa2f61ec11d32c43d9366ee7ea67e21e5f446d1"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcrash \
    kdbusaddons \
    kfilemetadata \
    ki18n \
    kio \
    kservice \
    kparts \
    kpty \
    kwidgetsaddons \
    kwindowsystem \
    kiconthemes \
    libarchive \
    libzip \
    zlib \
"

inherit kf6 gettext mime-xdg

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF"

FILES:${PN} += "${libdir}/plugins ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig"
RRECOMMENDS:${PN} += "unzip zip xz bzip2 gzip tar"

INSANE_SKIP:${PN} = "dev-so"
