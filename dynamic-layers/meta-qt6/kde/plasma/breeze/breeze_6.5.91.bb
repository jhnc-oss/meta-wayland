SUMMARY = "Breeze is the default style for Plasma"
HOMEPAGE = "https://invent.kde.org/plasma/breeze"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/breeze.git;protocol=https;nobranch=1"
SRCREV = "cb3f24d1090edbdb7de7e507d82a7202c89c5e68"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    frameworkintegration \
    qtquick3d \
    qtsvg \
    kcmutils \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kdecoration \
    kguiaddons \
    kiconthemes \
    kcolorscheme \
    ki18n \
    kirigami \
    kpackage \
    kwayland \
    kwindowsystem \
    kcmutils-tools-native \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE = "-DBUILD_QT5=OFF -DBUILD_TESTING=OFF"

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
	# breeze indeed wants to use kconfig_compiler_kf6 and kcmdesktopfilegenerator-> create links instead of touch
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/plugins ${datadir}"

RDEPENDS:${PN} += "breeze-icons qtquick3d kconfig kirigami frameworkintegration"

