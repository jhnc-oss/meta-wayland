SUMMARY = "Partition editor for KDE"
HOMEPAGE = "https://invent.kde.org/system/partitionmanager"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM += "file://LICENSES/GPL-3.0-or-later.txt;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://invent.kde.org/system/partitionmanager.git;protocol=https;nobranch=1"
SRCREV = "1a7b5aea841664cf9036fba42b03f83277faa9dd"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    ki18n \
    kjobwidgets \
    kio \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    kpmcore \
    polkit-qt \
"

inherit qt6-cmake gettext

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DCMAKE_DISABLE_FIND_PACKAGE_KF6DocTools=ON"

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6
}

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} += "kconfig polkit"
