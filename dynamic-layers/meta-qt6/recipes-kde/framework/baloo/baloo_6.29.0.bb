SUMMARY = "Baloo is the file indexing and file search framework for KDE Plasma"
HOMEPAGE = "https://invent.kde.org/frameworks/baloo"
LICENSE = "BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND bzip2-1.0.6"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/bzip2-1.0.6.txt;md5=f1d2fdc6b1d232981a8007aa1854d24d \
"

SRC_URI = "git://invent.kde.org/frameworks/baloo.git;protocol=https;nobranch=1;tag=v6.29.0"
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
