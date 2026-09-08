SUMMARY = "Utility that provides information about the computer system"
HOMEPAGE = "https://invent.kde.org/plasma/kinfocenter"
LICENSE = "BSD-2-Clause AND BSD-3-Clause AND CC0-1.0 AND FSFAP AND GPL-2.0-only AND GPL-2.0-or-later AND GPL-3.0-only AND LGPL-2.1-or-later AND LGPL-3.0-only AND LicenseRef-KDE-Accepted-GPL AND LicenseRef-KDE-Accepted-LGPL"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/FSFAP.txt;md5=232368338ef6dc99de71c2e05ff12176 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
"

SRC_URI = "git://invent.kde.org/plasma/kinfocenter.git;protocol=https;nobranch=1;tag=v6.7.4"
SRCREV = "a8ca8be109399581b31465c8ce3d74fd0ef7cf8d"

DEPENDS = " \
    qtbase \
    qttools-native \
    qtdeclarative \
    extra-cmake-modules \
    kconfig \
    kcoreaddons \
    ki18n \
    kcmutils \
    kio \
    kservice \
    solid \
    kauth \
    libdrm \
    udev \
    libusb1 \
    systemsettings \
"

inherit kf6 gettext pkgconfig

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF -DBUILD_DOC=OFF"

do_configure:append() {
	sed -i "s|${STAGING_BINDIR_NATIVE}/qdbus|${bindir}/qdbus|" ${B}/kcms/kwinsupportinfo/kcm_kwinsupportinfo.json
}

FILES:${PN} += "${libdir}/qml ${libdir}/plugins ${libdir}/libKInfoCenterInternal.so ${datadir}"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake"

RDEPENDS:${PN} += "kconfig systemsettings"
RRECOMMENDS:${PN} += "pciutils util-linux-lsblk libdisplay-info vulkan-tools wayland-utils qttools-tools"

INSANE_SKIP:${PN} = "dev-so"
