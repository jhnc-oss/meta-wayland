SUMMARY = "Baloo is the file indexing and file search framework for KDE Plasma"
HOMEPAGE = "https://invent.kde.org/frameworks/baloo"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/baloo.git;protocol=https;nobranch=1"
SRCREV = "b6e42eaad34f20ddeb1a854a96019d2f569b8613"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
    kconfig-native \
    kconfig \
    kcoreaddons \
    kdbusaddons \
    ki18n \
    kidletime \
    solid \
    kfilemetadata \
    kcrash \
    kio \
    lmdb \
    inotify-tools \
"

inherit qt6-cmake gettext

do_configure:prepend() {
	mkdir -p ${STAGING_LIBEXECDIR}/kf6
	ln -sf ${STAGING_LIBEXECDIR_NATIVE}/kf6/kconfig_compiler_kf6 ${STAGING_LIBEXECDIR}/kf6/kconfig_compiler_kf6
	touch ${STAGING_LIBEXECDIR}/kf6/kconf_update
}

do_install:append() {
    sed -i -e 's|${STAGING_DIR_HOST}||g' ${D}${libdir}/cmake/KF6Baloo/KF6BalooTargets.cmake
}

FILES:${PN} += "${datadir} ${systemd_user_unitdir} ${libdir}/qml ${libdir}/plugins"
