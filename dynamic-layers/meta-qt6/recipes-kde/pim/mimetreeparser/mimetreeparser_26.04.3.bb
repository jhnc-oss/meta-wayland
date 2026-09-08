SUMMARY = "Parser for MIME trees"
HOMEPAGE = "https://invent.kde.org/pim/mimetreeparser"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND FSFULLR AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=9e16594a228301089d759b4f178db91f \
    file://LICENSES/BSD-3-Clause.txt;md5=407426fcc1a243b7b2eff6e35c56aca9 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/FSFULLR.txt;md5=f0aa4b452548cc5d53a7772a9a90b3c0 \
    file://LICENSES/GPL-2.0-only.txt;md5=3d26203303a722dedc6bf909d95ba815 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=3d26203303a722dedc6bf909d95ba815 \
    file://LICENSES/GPL-3.0-only.txt;md5=75d892af193fd5a298f724c4377d8f62 \
    file://LICENSES/LGPL-2.0-only.txt;md5=e3e049b303846e4de3eeafccf035a404 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404 \
    file://LICENSES/LGPL-2.1-only.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=310c7c93cf5181c6b0cc8229a1f3c6f6 \
    file://LICENSES/LGPL-3.0-only.txt;md5=852ecadc0ac7e6f4d7144d5544a3815b \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/pim/mimetreeparser.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "f85dc85675b9c2cab08dbfcbf6ef5d0cb73e891f"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n \
    kcalendarcore \
    kcolorscheme \
    kwidgetsaddons \
    kmime \
    kmbox \
    libkleo \
    gpgmepp \
    qtdeclarative \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${libdir}/plugins ${libdir}/qml ${datadir}"
