SUMMARY = "Create documentation from DocBook"
HOMEPAGE = "https://invent.kde.org/frameworks/kdoctools"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/kdoctools.git;protocol=https;nobranch=1"
SRCREV = "8888aac15934db8abfb91bb05c82dbd887abbf23"

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

EXTRA_OECMAKE:class-target += "-DMEINPROC6_EXECUTABLE=${STAGING_BINDIR_NATIVE}/meinproc6"

do_install:append:class-target() {
    sed -i 's|${STAGING_DATADIR}|${datadir}|' ${D}${datadir}/kf6/kdoctools/customization/kde-include-common.xsl
    sed -i 's|${STAGING_DATADIR}|${datadir}|' ${D}${datadir}/kf6/kdoctools/customization/kde-include-man.xsl
    sed -i 's|${STAGING_DATADIR}|${datadir}|' ${D}${datadir}/kf6/kdoctools/customization/dtd/kdedbx45.dtd 
    sed -i 's|${STAGING_DATADIR}|${datadir}|' ${D}${datadir}/kf6/kdoctools/customization/xsl/all-l10n.xml 
}

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = "native"

