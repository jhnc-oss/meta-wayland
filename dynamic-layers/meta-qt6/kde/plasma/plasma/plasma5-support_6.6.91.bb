SUMMARY = "Plasma5Support Framework"
HOMEPAGE = "https://invent.kde.org/plasma/plasma5support"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/plasma/plasma5support.git;protocol=https;nobranch=1"
SRCREV = "e5fec35eea728d7a72e874254ef5fb83814c8b0a"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtquick3d \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    kguiaddons \
    ki18n \
    knotifications \
    solid \
    kservice \
    kidletime \
    kio \
    kholidays \
    networkmanager-qt \
    plasma-activities \
    kunitconversion \
"

inherit qt6-cmake gettext pkgconfig

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF -DWITH_X11=OFF"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kcmdesktopfilegenerator
	touch ${STAGING_BINDIR}/kpackagetool6
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "kconfig"
