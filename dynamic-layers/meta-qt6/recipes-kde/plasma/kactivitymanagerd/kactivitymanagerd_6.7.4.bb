SUMMARY = "System service that keeps track of the Plasma activities"
HOMEPAGE = "https://invent.kde.org/plasma/kactivitymanagerd"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "git://invent.kde.org/plasma/kactivitymanagerd.git;protocol=https;nobranch=1"
SRCREV = "be5a82c270a1623244c40c422d70081d56f73ce4"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    boost \
    kconfig \
    kconfig-native \
    kcrash \
    kdbusaddons \
    kglobalaccel \
    ki18n \
    kio \
    kwindowsystem \
    kxmlgui \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/plugins ${libdir}/libkactivitymanagerd_plugin.so ${datadir} ${systemd_user_unitdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig qtbase-plugins"
