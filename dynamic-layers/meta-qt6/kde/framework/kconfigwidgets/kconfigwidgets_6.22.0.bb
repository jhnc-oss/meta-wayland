SUMMARY = "Widgets for configuration dialogs"
HOMEPAGE = "https://invent.kde.org/frameworks/kconfigwidgets"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/frameworks/kconfigwidgets.git;protocol=https;nobranch=1"
SRCREV = "a5557ba4b8380afbf40d6c159236d21017ae665f"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kcoreaddons \
    kcodecs \
    kconfig \
    kguiaddons \
    ki18n \
    kwidgetaddons \
    kcolorscheme \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# cmake checks whether these files are present. We do not provide them in sysroot,
# but at least they are included in the package -> just touch the files to avoid errors.
do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

FILES:${PN} += "${datadir}/qlogging-categories6"

RDEPENDS:${PN} += "kconfig"
