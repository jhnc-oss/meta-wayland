SUMMARY = "Dolphin is KDE's file manager"
HOMEPAGE = "https://invent.kde.org/system/dolphin"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2"

SRC_URI = "git://invent.kde.org/system/dolphin.git;protocol=https;nobranch=1"
SRC_URI += "file://0001-CMakeLists.txt-disable-x11.patch"
SRCREV = "438d51032ae236af50d414e2bfdd36c0690f7f84"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    libxkbcommon \
    kconfig-native \
    kcoreaddons \
    kguiaddons \
    ki18n \
    kcrash \
    kcolorscheme \
    kcodecs \
    kwindowsystem \
    kwidgetaddons \
    kio \
    solid \
    kiconthemes \
    kparts \
    kdbusaddons \
    knotifications \
    kbookmarks \
    kcompletion \
    ktextwidgets \
    kcmutils \
    knewstuff \
    kfilemetadata \
"

inherit qt6-cmake gettext mime mime-xdg

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kcmdesktopfilegenerator
	# dolphin indeed wants to use kconfig_compiler_kf6 -> create a link instead of touch
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += " \
	${libdir}/kconf_update_bin \
	${libdir}/plugins \
	${datadir} \
	${systemd_user_unitdir} \
"

RDEPENDS:${PN} += "kconfig"
