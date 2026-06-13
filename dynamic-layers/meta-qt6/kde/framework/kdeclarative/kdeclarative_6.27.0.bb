SUMMARY = "Integration of QML and KDE work spaces"
HOMEPAGE = "https://invent.kde.org/frameworks/kdeclarative"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/frameworks/kdeclarative.git;protocol=https;nobranch=1"
SRCREV = "dfc9f158f1c6a96268d5fa086778f93370851a0b"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    ki18n\
    kconfig \
    kguiaddons \
    kglobalaccel \
    kwidgetsaddons \
"

inherit qt6-cmake gettext

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
}

FILES:${PN} += "${libdir}/qml ${datadir}"

RDEPENDS:${PN} += "kconfig"

