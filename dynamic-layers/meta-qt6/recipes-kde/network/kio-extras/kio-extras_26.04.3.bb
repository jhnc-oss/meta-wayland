SUMMARY = "Additional KIO workers for file, network and thumbnail access"
HOMEPAGE = "https://invent.kde.org/network/kio-extras"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND GPL-3.0-or-later AND LGPL-2.0-only AND LGPL-2.0-or-later AND LGPL-2.1-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL AND MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

SRC_URI = "git://invent.kde.org/network/kio-extras.git;protocol=https;nobranch=1;tag=v26.04.3"
SRCREV = "4a8ffec0ccacb5eefce743c95f57509f862c9d23"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtsvg \
    extra-cmake-modules \
    gperf-native \
    karchive \
    kconfig \
    kcoreaddons \
    ki18n \
    kio \
    solid \
    syntax-highlighting \
    kcmutils \
    kdbusaddons \
    knotifications \
    plasma-activities \
    plasma-activities-stats \
    qcoro \
    libproxy \
    shared-mime-info \
    libmtp \
    libssh \
    taglib \
    libtirpc \
"

inherit kf6 gettext pkgconfig mime

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)}"
PACKAGECONFIG[x11] = "-DWITHOUT_X11=OFF,-DWITHOUT_X11=ON,libx11 libxcursor"

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DBUILD_DOC=OFF \
    -DCMAKE_DISABLE_FIND_PACKAGE_Samba=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_KExiv2Qt6=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_OpenEXR=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_IMobileDevice=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_PList=ON \
    -DCMAKE_DISABLE_FIND_PACKAGE_libappimage=ON \
"

FILES:${PN} += "${libdir}/plugins ${libdir}/libexec ${datadir}"

RDEPENDS:${PN} += "kconfig perl"
