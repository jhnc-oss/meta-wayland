SUMMARY = "Create documentation from DocBook"
HOMEPAGE = "https://invent.kde.org/frameworks/kdoctools"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/frameworks/kdoctools.git;protocol=https;nobranch=1"
SRCREV = "715981e5ea1206d2a1bc0869c45146ffe8680efa"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    karchive \
    ki18n \
    libxml2 \
    libxslt \
    docbook-xml-dtd4 \
    docbook-xsl-stylesheets \
    liburi-perl-native \
    kdoctools-native \
"

inherit qt6-cmake gettext perlnative

EXTRA_OECMAKE:class-target += "-DMEINPROC6_EXECUTABLE=${STAGING_BINDIR_NATIVE}/meinproc6 -DDOCBOOKL10NHELPER_EXECUTABLE=${STAGING_BINDIR_NATIVE}/docbookl10nhelper"

do_install:append:class-native() {
    install -m0755 ${B}/bin/docbookl10nhelper ${D}${bindir}
}

do_install:append:class-target() {
    sed -i 's|${STAGING_DATADIR}|${datadir}|' ${D}${datadir}/kf6/kdoctools/customization/kde-include-common.xsl
    sed -i 's|${STAGING_DATADIR}|${datadir}|' ${D}${datadir}/kf6/kdoctools/customization/kde-include-man.xsl
    sed -i 's|${STAGING_DATADIR}|${datadir}|' ${D}${datadir}/kf6/kdoctools/customization/dtd/kdedbx45.dtd 
    sed -i 's|${STAGING_DATADIR}|${datadir}|' ${D}${datadir}/kf6/kdoctools/customization/xsl/all-l10n.xml
    ln -sf ${STAGING_BINDIR_NATIVE}/docbookl10nhelper ${STAGING_BINDIR}/docbookl10nhelper
}

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = "native"

