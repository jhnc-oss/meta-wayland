SUMMARY = "Archive manager for KDE"
HOMEPAGE = "https://invent.kde.org/utilities/ark"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/utilities/ark.git;protocol=https;nobranch=1"
SRCREV = "8fa2f61ec11d32c43d9366ee7ea67e21e5f446d1"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kconfig-native \
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

inherit qt6-cmake gettext mime-xdg

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/plugins ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig"
RRECOMMENDS:${PN} += "unzip zip xz bzip2 gzip tar"

INSANE_SKIP:${PN} = "dev-so"
