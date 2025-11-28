SUMMARY = "Aurorae is a themeable window decoration for KWin"
HOMEPAGE = "https://invent.kde.org/plasma/aurorae"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/plasma/aurorae.git;protocol=https;nobranch=1"
SRCREV = "be61e61ed993b0980e1e2742756bf0f745439372"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    ksvg \
    kcolorscheme \
    ki18n \
    kpackage \
    kcmutils \
    knewstuff \
    kdecoration \
"

inherit qt6-cmake gettext

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kcmdesktopfilegenerator
	touch ${STAGING_BINDIR}/kpackagetool6
}

FILES:${PN} += "${libdir}/qml  ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "bash kconfig kpackage"
