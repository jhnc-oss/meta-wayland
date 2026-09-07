SUMMARY = "Baloo is the file indexing and file search framework for KDE Plasma"
HOMEPAGE = "https://invent.kde.org/frameworks/baloo"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM += "file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0"

SRC_URI = "git://invent.kde.org/frameworks/baloo.git;protocol=https;nobranch=1"
SRCREV = "99dd4609948287da70168408da1fc596093c3980"

DEPENDS = " \
    qtbase \
    qttools-native \
    extra-cmake-modules \
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

inherit kf6 gettext

do_install:append() {
    sed -i -e 's|${STAGING_DIR_HOST}||g' ${D}${libdir}/cmake/KF6Baloo/KF6BalooTargets.cmake
}

FILES:${PN} += "${datadir} ${systemd_user_unitdir} ${libdir}/qml ${libdir}/plugins"
