SUMMARY = "Plugin framework for user interface components"
HOMEPAGE = "https://invent.kde.org/frameworks/kparts"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/frameworks/kparts.git;protocol=https;nobranch=1"
SRCREV = "67fe704d551ae546d380424a5a77f7bd2facbf29"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    ki18n \
    kservice \
    kjobwidgets \
    kwidgetaddons \
    kio \
    kxmlgui \
"

inherit qt6-cmake gettext

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} += "kconfig"

