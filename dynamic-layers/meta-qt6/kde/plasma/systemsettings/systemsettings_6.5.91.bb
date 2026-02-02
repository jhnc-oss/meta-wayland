SUMMARY = "Plasma System Settings"
HOMEPAGE = "https://invent.kde.org/plasma/systemsettings"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881"

SRC_URI = "git://invent.kde.org/plasma/systemsettings.git;protocol=https;nobranch=1"
SRCREV = "743cbe70e56980b666d253d747325c6acd18062d"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kauth \
    kcrash \
    kitemviews \
    kitemmodels \
    kcmutils \
    ki18n \
    kio \
    kservice \
    kiconthemes \
    kwidgetaddons \
    kwindowsystem \
    kxmlgui \
    kdbusaddons \
    kconfig \
    kguiaddons \
    kirigami \
    kjobwidgets \
    krunner \
    kcolorscheme \
    plasma-activities \
"

inherit qt6-cmake gettext mime mime-xdg

do_configure:prepend() {
	# cmake checks whether these files are present. We do not provide them in sysroot,
	# but at least they are included in the package -> just touch the files to avoid errors.
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kcmdesktopfilegenerator
}

FILES:${PN} += " \
	${libdir}/kconf_update_bin \
	${libdir}/plugins \
	${datadir} \
	${systemd_user_unitdir} \
"

RDEPENDS:${PN} += "kconfig kirigami qtquick3d"
