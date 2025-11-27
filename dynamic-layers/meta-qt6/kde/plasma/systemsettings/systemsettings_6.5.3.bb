SUMMARY = "Plasma System Settings"
HOMEPAGE = "https://invent.kde.org/plasma/systemsettings"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9"

SRC_URI = "git://invent.kde.org/plasma/systemsettings.git;protocol=https;nobranch=1"
SRCREV = "c057967ac9d022547cba6505387f63cf2fd13540"

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

RDEPENDS:${PN} += "kconfig"
