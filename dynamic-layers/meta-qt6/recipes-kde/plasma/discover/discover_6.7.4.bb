SUMMARY = "KDE and Plasma resources management GUI"
HOMEPAGE = "https://invent.kde.org/plasma/discover"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977"

SRC_URI = "git://invent.kde.org/plasma/discover.git;protocol=https;nobranch=1"
SRCREV = "71fc76cdd049f71ca2086bdcbd1faa52dba46ba7"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig-native \
    kcmutils-tools-native \
    kirigami \
    kirigami-addons \
    kcoreaddons \
    kconfig \
    kcrash \
    kdbusaddons \
    ki18n \
    karchive \
    kxmlgui \
    kio \
    kcmutils \
    kidletime \
    knotifications \
    purpose \
    kstatusnotifieritem \
    kiconthemes \
    kuserfeedback \
    attica \
    knewstuff \
    appstream \
    qcoro \
"

inherit qt6-cmake gettext pkgconfig mime-xdg

PACKAGECONFIG ?= "flatpak"
PACKAGECONFIG[flatpak] = ",,flatpak"
PACKAGECONFIG[fwupd] = ",,fwupd"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DCMAKE_DISABLE_FIND_PACKAGE_packagekitqt6=ON"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	touch ${STAGING_BINDIR}/kpackagetool6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kcmdesktopfilegenerator ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${libdir}/plasma-discover ${datadir} ${systemd_user_unitdir}"

RDEPENDS:${PN} += "kconfig kirigami kirigami-addons appstream"
RRECOMMENDS:${PN} += "flatpak"

INSANE_SKIP:${PN} = "dev-so"
